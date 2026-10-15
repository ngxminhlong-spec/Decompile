package c1;

import android.text.TextUtils;
import java.io.IOException;
import java.io.Serializable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: c1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0234c implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    public String f3546o;

    /* renamed from: p, reason: collision with root package name */
    public int f3547p;

    /* renamed from: q, reason: collision with root package name */
    public int f3548q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f3549r;

    public C0234c(int i4, int i5, String str, boolean z4) {
        this.f3546o = str;
        this.f3547p = i4;
        this.f3548q = i5;
        this.f3549r = z4;
    }

    public static C0234c b(XmlPullParser xmlPullParser) {
        int i4;
        if (!"node".equals(xmlPullParser.getName())) {
            return null;
        }
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "position");
        if (attributeValue2 == null) {
            throw new NullPointerException("Name is null");
        }
        if (attributeValue2.equals("TOP")) {
            i4 = 1;
        } else if (attributeValue2.equals("LEFT")) {
            i4 = 2;
        } else if (attributeValue2.equals("RIGHT")) {
            i4 = 3;
        } else {
            if (!attributeValue2.equals("BOTTOM")) {
                throw new IllegalArgumentException("No enum constant com.duracodefactory.logiccircuitsimulatorpro.inputoutput.Position.".concat(attributeValue2));
            }
            i4 = 4;
        }
        int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue(null, "count_position"));
        boolean parseBoolean = Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "show_text"));
        if (TextUtils.isEmpty(attributeValue)) {
            throw new IOException("No NodeInfo id");
        }
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1 && (eventType != 3 || !"node".equals(xmlPullParser.getName()))) {
            eventType = xmlPullParser.next();
        }
        return new C0234c(i4, parseInt, attributeValue, parseBoolean);
    }

    public final C0234c a() {
        return new C0234c(this.f3547p, this.f3548q, this.f3546o, this.f3549r);
    }

    public final void g(XmlSerializer xmlSerializer) {
        String str;
        xmlSerializer.startTag(null, "node");
        xmlSerializer.attribute(null, "id", this.f3546o);
        int i4 = this.f3547p;
        if (i4 == 1) {
            str = "TOP";
        } else if (i4 == 2) {
            str = "LEFT";
        } else if (i4 == 3) {
            str = "RIGHT";
        } else {
            if (i4 != 4) {
                throw null;
            }
            str = "BOTTOM";
        }
        xmlSerializer.attribute(null, "position", str);
        xmlSerializer.attribute(null, "count_position", String.valueOf(this.f3548q));
        xmlSerializer.attribute(null, "show_text", String.valueOf(this.f3549r));
        xmlSerializer.endTag(null, "node");
    }
}
