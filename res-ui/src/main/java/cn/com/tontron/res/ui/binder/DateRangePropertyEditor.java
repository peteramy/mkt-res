package cn.com.tontron.res.ui.binder;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;

/**
 * Created by yangyang on 2018/1/18.
 */
public class DateRangePropertyEditor extends PropertyEditorSupport {
    private final String outFmt;
    private final String separator;
    private final String[] fmt;

    public DateRangePropertyEditor(String separator, String outFmt, String[] fmt) {
        this.separator = separator;
        this.fmt = fmt;
        this.outFmt = outFmt;
    }

    public DateRangePropertyEditor(String separator, String outFmt, String format) {
        this(separator, outFmt, new String[]{format});
    }

    public DateRangePropertyEditor(String separator, String outFmt) {
        this(separator, outFmt, new String[]{outFmt});
    }

    public String getAsText() {
        if (this.getValue() instanceof DateRange) {
            DateRange range = (DateRange) this.getValue();
            return String.format("%s%s%s", new Object[]{DateFormatUtils.format(range.getStart(), this.outFmt), this.separator, DateFormatUtils.format(range.getEnd(), this.outFmt)});
        } else {
            return super.getAsText();
        }
    }

    public void setAsText(String value) {
        try {
            if (value != null && !value.equals("")) {
                DateRange e = new DateRange();
                String[] dates = value.split(this.separator);
                e.setStart(DateUtils.parseDate(dates[0], this.fmt));
                e.setEnd(DateUtils.parseDate(dates[1], this.fmt));
                this.setValue(e);
            } else {
                this.setValue((Object) null);
            }
        } catch (ParseException var4) {
            this.setValue((Object) null);
        }

    }
}

