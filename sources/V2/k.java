package V2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.gms.internal.play_billing.B;
import d3.AbstractC1654b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: m, reason: collision with root package name */
    public static final h f1902m = new h(0.5f);

    /* renamed from: a, reason: collision with root package name */
    public B f1903a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public B f1904b = new Object();
    public B c = new Object();
    public B d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public c f1905e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public c f1906f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public c f1907g = new a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public c f1908h = new a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public e f1909i;

    /* renamed from: j, reason: collision with root package name */
    public e f1910j;

    /* renamed from: k, reason: collision with root package name */
    public e f1911k;

    /* renamed from: l, reason: collision with root package name */
    public e f1912l;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.gms.internal.play_billing.B] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.google.android.gms.internal.play_billing.B] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.android.gms.internal.play_billing.B] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.google.android.gms.internal.play_billing.B] */
    public k() {
        int i4 = 0;
        this.f1909i = new e(i4);
        this.f1910j = new e(i4);
        this.f1911k = new e(i4);
        this.f1912l = new e(i4);
    }

    public static j a(Context context, int i4, int i5, c cVar) {
        if (i5 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i4);
            i4 = i5;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, B2.a.f156v);
        try {
            int i6 = obtainStyledAttributes.getInt(0, 0);
            int i7 = obtainStyledAttributes.getInt(3, i6);
            int i8 = obtainStyledAttributes.getInt(4, i6);
            int i9 = obtainStyledAttributes.getInt(2, i6);
            int i10 = obtainStyledAttributes.getInt(1, i6);
            c b4 = b(obtainStyledAttributes, 5, cVar);
            c b5 = b(obtainStyledAttributes, 8, b4);
            c b6 = b(obtainStyledAttributes, 9, b4);
            c b7 = b(obtainStyledAttributes, 7, b4);
            c b8 = b(obtainStyledAttributes, 6, b4);
            j jVar = new j();
            jVar.f1892a = AbstractC1654b.o(i7);
            jVar.f1894e = b5;
            jVar.f1893b = AbstractC1654b.o(i8);
            jVar.f1895f = b6;
            jVar.c = AbstractC1654b.o(i9);
            jVar.f1896g = b7;
            jVar.d = AbstractC1654b.o(i10);
            jVar.f1897h = b8;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static c b(TypedArray typedArray, int i4, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i4);
        if (peekValue != null) {
            int i5 = peekValue.type;
            if (i5 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i5 == 6) {
                return new h(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cVar;
    }

    public final boolean c(RectF rectF) {
        boolean z4 = this.f1912l.getClass().equals(e.class) && this.f1910j.getClass().equals(e.class) && this.f1909i.getClass().equals(e.class) && this.f1911k.getClass().equals(e.class);
        float a4 = this.f1905e.a(rectF);
        return z4 && ((this.f1906f.a(rectF) > a4 ? 1 : (this.f1906f.a(rectF) == a4 ? 0 : -1)) == 0 && (this.f1908h.a(rectF) > a4 ? 1 : (this.f1908h.a(rectF) == a4 ? 0 : -1)) == 0 && (this.f1907g.a(rectF) > a4 ? 1 : (this.f1907g.a(rectF) == a4 ? 0 : -1)) == 0) && ((this.f1904b instanceof i) && (this.f1903a instanceof i) && (this.c instanceof i) && (this.d instanceof i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, V2.j] */
    public final j d() {
        ?? obj = new Object();
        obj.f1892a = this.f1903a;
        obj.f1893b = this.f1904b;
        obj.c = this.c;
        obj.d = this.d;
        obj.f1894e = this.f1905e;
        obj.f1895f = this.f1906f;
        obj.f1896g = this.f1907g;
        obj.f1897h = this.f1908h;
        obj.f1898i = this.f1909i;
        obj.f1899j = this.f1910j;
        obj.f1900k = this.f1911k;
        obj.f1901l = this.f1912l;
        return obj;
    }

    public final k e(float f4) {
        j d = d();
        d.f1894e = new a(f4);
        d.f1895f = new a(f4);
        d.f1896g = new a(f4);
        d.f1897h = new a(f4);
        return d.a();
    }
}
