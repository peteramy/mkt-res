#子module
单独打包：在根路径下执行: mvn -pl module_name -am。单独的module没有UI。
运行：java -jar xxxxx.jar
#模块说明#
##res-common##
基础模块
##res-auth##
鉴权模块，存放用户角色等等
模块编号：99999901
###用户管理###
模块编号：9999990101
方法起始：99999901010001
##res-ims##
进销存
模块编号：99999902
###XXX###
模块编号：9999990201
方法起始：99999902010001
##res-term##
终端管理
模块编号：99999903
##res-num##
号码管理
模块编号：99999904
##res-card##
uim卡管理
模块编号：99999905
##res-logis##
物流管理
模块编号：99999906
##res-inv##
发票管理
模块编号：99999907
##res-other##
其他营销资源管理
模块编号：99999999
##res-ui##
系统管理UI，提供给CRM集成（或者是只用来营销资源管理）
##数据层##
模块编号：99999900
###鉴权数据###
模块编号：9999990001
方法起始：99999900010001