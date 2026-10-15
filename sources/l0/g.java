package l0;

import android.graphics.Paint;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class g extends j {
    public androidx.activity.result.c d;

    /* renamed from: e, reason: collision with root package name */
    public float f13885e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.activity.result.c f13886f;

    /* renamed from: g, reason: collision with root package name */
    public float f13887g;

    /* renamed from: h, reason: collision with root package name */
    public float f13888h;

    /* renamed from: i, reason: collision with root package name */
    public float f13889i;

    /* renamed from: j, reason: collision with root package name */
    public float f13890j;

    /* renamed from: k, reason: collision with root package name */
    public float f13891k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f13892l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f13893m;

    /* renamed from: n, reason: collision with root package name */
    public float f13894n;

    @Override // l0.i
    public final boolean a() {
        return this.f13886f.c() || this.d.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // l0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int[] r7) {
        /*
            r6 = this;
            androidx.activity.result.c r0 = r6.f13886f
            boolean r1 = r0.c()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.c
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f2431a
            if (r1 == r4) goto L1e
            r0.f2431a = r1
            r0 = r2
            goto L1f
        L1e:
            r0 = r3
        L1f:
            androidx.activity.result.c r1 = r6.d
            boolean r4 = r1.c()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.c
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f2431a
            if (r7 == r4) goto L3a
            r1.f2431a = r7
            goto L3b
        L3a:
            r2 = r3
        L3b:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.g.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f13888h;
    }

    public int getFillColor() {
        return this.f13886f.f2431a;
    }

    public float getStrokeAlpha() {
        return this.f13887g;
    }

    public int getStrokeColor() {
        return this.d.f2431a;
    }

    public float getStrokeWidth() {
        return this.f13885e;
    }

    public float getTrimPathEnd() {
        return this.f13890j;
    }

    public float getTrimPathOffset() {
        return this.f13891k;
    }

    public float getTrimPathStart() {
        return this.f13889i;
    }

    public void setFillAlpha(float f4) {
        this.f13888h = f4;
    }

    public void setFillColor(int i4) {
        this.f13886f.f2431a = i4;
    }

    public void setStrokeAlpha(float f4) {
        this.f13887g = f4;
    }

    public void setStrokeColor(int i4) {
        this.d.f2431a = i4;
    }

    public void setStrokeWidth(float f4) {
        this.f13885e = f4;
    }

    public void setTrimPathEnd(float f4) {
        this.f13890j = f4;
    }

    public void setTrimPathOffset(float f4) {
        this.f13891k = f4;
    }

    public void setTrimPathStart(float f4) {
        this.f13889i = f4;
    }
}
