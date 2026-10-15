package U2;

import android.graphics.Paint;
import android.graphics.Path;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f1810i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f1811j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f1812k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f1813l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f1814a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f1815b;
    public final Paint c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1816e;

    /* renamed from: f, reason: collision with root package name */
    public int f1817f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f1818g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f1819h;

    public a() {
        Paint paint = new Paint();
        this.f1819h = paint;
        this.f1814a = new Paint();
        this.d = A.a.d(-16777216, 68);
        this.f1816e = A.a.d(-16777216, 20);
        this.f1817f = A.a.d(-16777216, 0);
        this.f1814a.setColor(this.d);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f1815b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.c = new Paint(paint2);
    }
}
