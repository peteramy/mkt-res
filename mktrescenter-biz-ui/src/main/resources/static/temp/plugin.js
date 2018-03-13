var table_lang = {
    "sProcessing": "处理中...",
    "sLengthMenu": "每页 _MENU_ 项",
    "sZeroRecords": "没有匹配结果",
    "sInfo": "当前显示第 _START_ 至 _END_ 项，共 _TOTAL_ 项。",
    "sInfoEmpty": "当前显示第 0 至 0 项，共 0 项",
    "sInfoFiltered": "(由 _MAX_ 项结果过滤)",
    "sInfoPostFix": "",
    "sSearch": "搜索:",
    "sUrl": "",
    "sEmptyTable": "表中数据为空",
    "sLoadingRecords": "载入中...",
    "sInfoThousands": ",",
    "oPaginate": {
        "sFirst": "首页",
        "sPrevious": "上页",
        "sNext": "下页",
        "sLast": "末页",
        "sJump": "跳转"
    },
    "oAria": {
        "sSortAscending": ": 以升序排列此列",
        "sSortDescending": ": 以降序排列此列"
    },
    select: {
        rows: "选中 %d 行"
    }
};
function modal(a, method) {
    if (!method) {
        method = "get";
    }
    if ($(a).attr("href")) {
        $.ajax({
            type: method,
            url: $(a).attr("href"),
            dataType: "html",
            success: function (result) {
                $("#modal_container").empty();
                $("#modal_container").append(result);
                $("#modal_container").modal();
            }
        });
    }
}
function reload(a) {
    if ($(a).attr("href")) {
        var rep = true;
        if ($(a).hasClass("btn-danger")) {
            rep = confirm("确认执行" + $(a).text() + "操作吗？");
        }
        if (rep) {
            $.ajax({
                type: "get",
                url: $(a).attr("href"),
                dataType: "json",
                success: function (result) {
                    $(a).parents("table").dataTable().fnDraw(false);
                }
            });
        }
    }
}
function refresh(a) {
    if ($(a).attr("href")) {
        var rep = true;
        if ($(a).hasClass("btn-danger")) {
            rep = confirm("确认执行" + $(a).text() + "操作吗？");
        }
        if (rep) {
            $.ajax({
                type: "get",
                url: $(a).attr("href"),
                dataType: "json",
                success: function (result) {
                    window.location.reload();
                }
            });
        }
    }
}
function redirect(a) {
    if ($(a).attr("href")) {
        var temp = document.createElement("form");
        temp.action = $(a).attr("href");
        temp.method = "post";
        temp.style.display = "none";

        var opt = document.createElement("textarea");
        opt.name = csrf_name;
        opt.value = csrf_token;
        temp.appendChild(opt);

        document.body.appendChild(temp);
        temp.submit();

        return temp;
    }
}
function ajax_table(table, url, columns, options) {
    var search_div = table.parents(".panel").find(".search-div");

    var tab_ops = {
        columns: columns,
        ajax: function (data, callback, settings) {
            var param = {};
            param.pageSize = data.length;
            param.pageNo = (data.start / data.length) + 1;
            if (search_div) {
                var conditions = search_div.find(".search-input");
                for (var i = 0; i < conditions.length; i++) {
                    param[$(conditions[i]).attr("name")] = $(conditions[i]).val();
                }
            }
            param[csrf_name] = csrf_token;

            if (data.order) {
                var order_map = {};
                for (var i = 0; i < data.order.length; i++) {
                    order_map[data.columns[data.order[i].column].data] = data.order[i].dir;
                }
                param["order"] = order_map;
            }
            $.ajax({
                type: "post",
                url: url,
                cache: false,
                data: param,
                dataType: "json",
                success: function (result) {
                    var returnData = {};
                    for (var key in result.data) {
                        returnData[key] = result.data[key];
                    }
                    returnData.recordsFiltered = returnData.recordsTotal;
                    callback(returnData);
                }
            });
        },
        responsive: true,
//                select: {
//                    items: 'row',
//                    style: 'os',
//                    className: 'selected'
//                },
        language: table_lang,  // 提示信息
        autoWidth: false,   // 禁用自动调整列宽
        bLengthChange: false, // 禁用显示每页多少行
        //lengthMenu: [25, 50, 100],
        stripeClasses: ["odd", "even"], // 为奇偶行加上样式，兼容不支持CSS伪类的场合
        processing: false,   // 隐藏加载提示,自行处理
        serverSide: true,   // 启用服务器端分页
        searching: false,    // 启用原生搜索
        orderMulti: true,   // 启用多列排序
        order: [],       // 取消默认排序查询,否则复选框一列会出现小箭头
        renderer: "bootstrap", // 渲染样式：Bootstrap和jquery-ui
        pagingType: "simple_numbers", //分页样式：simple,simple_numbers,full,full_numbers
        columnDefs: [{
            "targets": 'nosort', // 列的样式名
            "orderable": false  // 包含上样式名‘nosort'的禁止排序
        }]
    };
    if (options) {
        for (var key in options) {
            tab_ops[key] = options[key];
        }
    }
    var tableObj = table.DataTable(tab_ops);
    if (search_div) {
        var btn = search_div.find(".search-btn");
        if (btn) {
            btn.click(function () {
                table.dataTable().fnDraw(false);
            });
        }
    }
    return tableObj;
}