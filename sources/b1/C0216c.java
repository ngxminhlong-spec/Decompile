package b1;

import android.graphics.Canvas;
import android.graphics.Paint;
import m2.AbstractC1806a;
import p1.C1918d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0216c implements e {

    /* renamed from: o, reason: collision with root package name */
    public C1918d f3460o;

    /* renamed from: p, reason: collision with root package name */
    public Paint f3461p;

    /* renamed from: q, reason: collision with root package name */
    public int f3462q;

    /* renamed from: r, reason: collision with root package name */
    public int f3463r;

    /* renamed from: s, reason: collision with root package name */
    public int f3464s;

    /* renamed from: t, reason: collision with root package name */
    public int f3465t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3466u;

    @Override // b1.e
    public final void j(Canvas canvas) {
        float f4;
        float f5;
        Paint paint;
        Paint paint2 = this.f3461p;
        C1918d c1918d = this.f3460o;
        float G3 = c1918d.G();
        float F2 = c1918d.F();
        int i4 = (int) (0.35f * G3);
        int i5 = (int) (0.45f * F2);
        if (this.f3466u) {
            i4 = (int) (G3 - i4);
        }
        canvas.translate(i4, i5);
        canvas.save();
        float f6 = c1918d.f14508V;
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC1806a.f14037l);
        sb.append(" ");
        String l4 = U.a.l(sb, (int) (f6 * 100.0f), "%");
        if (l4.length() > 25) {
            l4 = l4.substring(0, 22) + "...";
        }
        String str = AbstractC1806a.f14044q + " " + c1918d.f14513a0;
        if (str.length() > 25) {
            str = str.substring(0, 22) + "...";
        }
        String str2 = AbstractC1806a.f14042o + " " + (c1918d.f14511Y / 1000.0f) + "V";
        if (str2.length() > 25) {
            StringBuilder sb2 = new StringBuilder();
            f4 = G3;
            sb2.append(str2.substring(0, 22));
            sb2.append("...");
            str2 = sb2.toString();
        } else {
            f4 = G3;
        }
        String str3 = AbstractC1806a.f14039m + " " + (c1918d.f14509W / 10.0f) + "°C / " + (((int) ((((r3 * 9.0f) / 5.0f) + 32.0f) * 100.0f)) / 100.0f) + "°F";
        if (str3.length() > 25) {
            StringBuilder sb3 = new StringBuilder();
            f5 = F2;
            sb3.append(str3.substring(0, 22));
            sb3.append("...");
            str3 = sb3.toString();
        } else {
            f5 = F2;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(AbstractC1806a.f14041n);
        sb4.append(" ");
        int i6 = c1918d.f14510X;
        sb4.append(i6 != 2 ? i6 != 3 ? i6 != 4 ? i6 != 5 ? i6 != 6 ? AbstractC1806a.f13992A : AbstractC1806a.f14049v : AbstractC1806a.f14047t : AbstractC1806a.f14045r : AbstractC1806a.f14048u : AbstractC1806a.f14046s);
        String sb5 = sb4.toString();
        if (sb5.length() > 25) {
            sb5 = sb5.substring(0, 22) + "...";
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(AbstractC1806a.f14043p);
        sb6.append(" ");
        int i7 = c1918d.f14512Z;
        String str4 = AbstractC1806a.f13992A;
        if (i7 == 2) {
            str4 = AbstractC1806a.f14050w;
        } else if (i7 == 3) {
            str4 = AbstractC1806a.f14051x;
        } else if (i7 == 4) {
            str4 = AbstractC1806a.f14052z;
        } else if (i7 == 5) {
            str4 = AbstractC1806a.y;
        }
        sb6.append(str4);
        String sb7 = sb6.toString();
        if (sb7.length() > 25) {
            sb7 = sb7.substring(0, 22) + "...";
        }
        Paint paint3 = AbstractC1806a.f13993B;
        canvas.drawText(l4, 0.0f, 0.0f, paint3);
        canvas.translate(0.0f, paint3.getTextSize());
        canvas.drawText(str, 0.0f, 0.0f, paint3);
        canvas.translate(0.0f, paint3.getTextSize());
        canvas.drawText(str2, 0.0f, 0.0f, paint3);
        canvas.translate(0.0f, paint3.getTextSize());
        canvas.drawText(str3, 0.0f, 0.0f, paint3);
        canvas.translate(0.0f, paint3.getTextSize());
        canvas.drawText(sb5, 0.0f, 0.0f, paint3);
        canvas.translate(0.0f, paint3.getTextSize());
        canvas.drawText(sb7, 0.0f, 0.0f, paint3);
        canvas.restore();
        canvas.translate(-i4, -i5);
        canvas.translate((int) (f4 * 0.407f), (int) (f5 * 0.106f));
        double d = f6;
        if (d < 0.2d) {
            paint = paint2;
            paint.setColor(this.f3462q);
        } else {
            paint = paint2;
            if (d < 0.5d) {
                paint.setColor(this.f3463r);
            } else if (d < 0.75d) {
                paint.setColor(this.f3464s);
            } else {
                paint.setColor(this.f3465t);
            }
        }
        canvas.drawRect(0.0f, 0.0f, (f4 / 5.9f) * f6, f5 / 8.0f, paint);
        canvas.translate(-r7, -r9);
    }
}
