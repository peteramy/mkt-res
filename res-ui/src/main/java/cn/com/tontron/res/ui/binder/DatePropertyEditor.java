package cn.com.tontron.res.ui.binder;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.util.Date;

public class DatePropertyEditor extends PropertyEditorSupport {
    private final String outFmt;
    private String[] fmt;

    public DatePropertyEditor(String outFmt, String[] fmt) {
        this.fmt = fmt;
        this.outFmt = outFmt;
    }

    public DatePropertyEditor(String outFmt, String format) {
        this(outFmt, new String[]{format});
    }

    public DatePropertyEditor(String outFmt) {
        this(outFmt, new String[]{outFmt});
    }

    public String getAsText() {
        return this.getValue() instanceof Date ? DateFormatUtils.format((Date) this.getValue(), this.outFmt) : super.getAsText();
    }

    public void setAsText(String value) {
        try {
            if (value != null && !value.equals("")) {
                this.setValue(DateUtils.parseDate(value, this.fmt));
            } else {
                this.setValue((Object) null);
            }
        } catch (ParseException var3) {
            this.setValue((Object) null);
        }

    }
}
