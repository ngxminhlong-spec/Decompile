package a1;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.TypedValue;
import com.duracodefactory.logiccircuitsimulatorpro.view.BoardView;
import e1.d;
import h1.AbstractC1698a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;
import p1.AbstractC1913K;
import q1.AbstractC1955j;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends W0.a {

    /* renamed from: r, reason: collision with root package name */
    public final String f2349r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2350s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f2351t;

    public a(long j4, float f4, float f5, String str, int i4, boolean z4) {
        this.f1942q = j4;
        this.f1940o = f4;
        this.f1941p = f5;
        this.f2350s = i4;
        this.f2349r = str;
        this.f2351t = z4;
    }

    public static a c(XmlPullParser xmlPullParser) {
        float parseFloat = Float.parseFloat(xmlPullParser.getAttributeValue(null, "x"));
        float parseFloat2 = Float.parseFloat(xmlPullParser.getAttributeValue(null, "y"));
        long parseLong = Long.parseLong(xmlPullParser.getAttributeValue(null, "id"));
        int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue(null, "size"));
        String attributeValue = xmlPullParser.getAttributeValue(null, "text");
        boolean parseBoolean = Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "outline"));
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1 && (eventType != 3 || !"create_text_strategy".equals(xmlPullParser.getName()))) {
            eventType = xmlPullParser.next();
        }
        return new a(parseLong, parseFloat, parseFloat2, attributeValue, parseInt, parseBoolean);
    }

    @Override // W0.a
    public final W0.a a(long j4) {
        return new a(j4, this.f1940o, this.f1941p, this.f2349r, this.f2350s, this.f2351t);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p1.e0, h1.a, p1.K] */
    @Override // W0.a
    public final AbstractC1698a b(d dVar) {
        long j4 = this.f1942q;
        float f4 = this.f1940o;
        float f5 = this.f1941p;
        C1995b c1995b = dVar.f12683R;
        ?? abstractC1913K = new AbstractC1913K(j4, f4, f5, c1995b);
        int i4 = 10;
        abstractC1913K.f14523V = 10;
        abstractC1913K.f14524W = 1.0f;
        abstractC1913K.f14517P = this.f2349r;
        int i5 = this.f2350s;
        abstractC1913K.f14518Q = i5;
        abstractC1913K.f14519R = this.f2351t;
        Paint paint = new Paint();
        abstractC1913K.f14520S = paint;
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setStyle(abstractC1913K.f14519R ? Paint.Style.STROKE : Paint.Style.FILL_AND_STROKE);
        if (i5 > 10) {
            abstractC1913K.f14524W = i5 / 10;
        } else {
            i4 = i5;
        }
        float f6 = i4;
        paint.setTextSize(TypedValue.applyDimension(5, f6, ((BoardView) c1995b.f14883r).getResources().getDisplayMetrics()));
        paint.setStrokeWidth(f6 / 4.0f);
        Paint paint2 = new Paint();
        abstractC1913K.f14521T = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(AbstractC1955j.f14679g);
        paint2.setStrokeWidth(i4 / 80);
        abstractC1913K.O();
        abstractC1913K.H();
        return abstractC1913K;
    }

    @Override // W0.a
    public final void g(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag(null, "create_text_strategy");
        xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
        xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
        xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
        xmlSerializer.attribute(null, "text", this.f2349r);
        xmlSerializer.attribute(null, "size", String.valueOf(this.f2350s));
        xmlSerializer.attribute(null, "outline", String.valueOf(this.f2351t));
        xmlSerializer.endTag(null, "create_text_strategy");
    }
}
