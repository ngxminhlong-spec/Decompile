package l0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f13895a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13896b;
    public float c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f13897e;

    /* renamed from: f, reason: collision with root package name */
    public float f13898f;

    /* renamed from: g, reason: collision with root package name */
    public float f13899g;

    /* renamed from: h, reason: collision with root package name */
    public float f13900h;

    /* renamed from: i, reason: collision with root package name */
    public float f13901i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f13902j;

    /* renamed from: k, reason: collision with root package name */
    public String f13903k;

    public h() {
        this.f13895a = new Matrix();
        this.f13896b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.f13897e = 0.0f;
        this.f13898f = 1.0f;
        this.f13899g = 1.0f;
        this.f13900h = 0.0f;
        this.f13901i = 0.0f;
        this.f13902j = new Matrix();
        this.f13903k = null;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [l0.j, l0.g] */
    public h(h hVar, r.e eVar) {
        j jVar;
        this.f13895a = new Matrix();
        this.f13896b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.f13897e = 0.0f;
        this.f13898f = 1.0f;
        this.f13899g = 1.0f;
        this.f13900h = 0.0f;
        this.f13901i = 0.0f;
        Matrix matrix = new Matrix();
        this.f13902j = matrix;
        this.f13903k = null;
        this.c = hVar.c;
        this.d = hVar.d;
        this.f13897e = hVar.f13897e;
        this.f13898f = hVar.f13898f;
        this.f13899g = hVar.f13899g;
        this.f13900h = hVar.f13900h;
        this.f13901i = hVar.f13901i;
        String str = hVar.f13903k;
        this.f13903k = str;
        if (str != null) {
            eVar.put(str, this);
        }
        matrix.set(hVar.f13902j);
        ArrayList arrayList = hVar.f13896b;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            Object obj = arrayList.get(i4);
            if (obj instanceof h) {
                this.f13896b.add(new h((h) obj, eVar));
            } else {
                if (obj instanceof g) {
                    g gVar = (g) obj;
                    ?? jVar2 = new j(gVar);
                    jVar2.f13885e = 0.0f;
                    jVar2.f13887g = 1.0f;
                    jVar2.f13888h = 1.0f;
                    jVar2.f13889i = 0.0f;
                    jVar2.f13890j = 1.0f;
                    jVar2.f13891k = 0.0f;
                    jVar2.f13892l = Paint.Cap.BUTT;
                    jVar2.f13893m = Paint.Join.MITER;
                    jVar2.f13894n = 4.0f;
                    jVar2.d = gVar.d;
                    jVar2.f13885e = gVar.f13885e;
                    jVar2.f13887g = gVar.f13887g;
                    jVar2.f13886f = gVar.f13886f;
                    jVar2.c = gVar.c;
                    jVar2.f13888h = gVar.f13888h;
                    jVar2.f13889i = gVar.f13889i;
                    jVar2.f13890j = gVar.f13890j;
                    jVar2.f13891k = gVar.f13891k;
                    jVar2.f13892l = gVar.f13892l;
                    jVar2.f13893m = gVar.f13893m;
                    jVar2.f13894n = gVar.f13894n;
                    jVar = jVar2;
                } else {
                    if (!(obj instanceof f)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    jVar = new j((f) obj);
                }
                this.f13896b.add(jVar);
                Object obj2 = jVar.f13905b;
                if (obj2 != null) {
                    eVar.put(obj2, jVar);
                }
            }
        }
    }

    @Override // l0.i
    public final boolean a() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f13896b;
            if (i4 >= arrayList.size()) {
                return false;
            }
            if (((i) arrayList.get(i4)).a()) {
                return true;
            }
            i4++;
        }
    }

    @Override // l0.i
    public final boolean b(int[] iArr) {
        int i4 = 0;
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f13896b;
            if (i4 >= arrayList.size()) {
                return z4;
            }
            z4 |= ((i) arrayList.get(i4)).b(iArr);
            i4++;
        }
    }

    public final void c() {
        Matrix matrix = this.f13902j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f13897e);
        matrix.postScale(this.f13898f, this.f13899g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.f13900h + this.d, this.f13901i + this.f13897e);
    }

    public String getGroupName() {
        return this.f13903k;
    }

    public Matrix getLocalMatrix() {
        return this.f13902j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f13897e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f13898f;
    }

    public float getScaleY() {
        return this.f13899g;
    }

    public float getTranslateX() {
        return this.f13900h;
    }

    public float getTranslateY() {
        return this.f13901i;
    }

    public void setPivotX(float f4) {
        if (f4 != this.d) {
            this.d = f4;
            c();
        }
    }

    public void setPivotY(float f4) {
        if (f4 != this.f13897e) {
            this.f13897e = f4;
            c();
        }
    }

    public void setRotation(float f4) {
        if (f4 != this.c) {
            this.c = f4;
            c();
        }
    }

    public void setScaleX(float f4) {
        if (f4 != this.f13898f) {
            this.f13898f = f4;
            c();
        }
    }

    public void setScaleY(float f4) {
        if (f4 != this.f13899g) {
            this.f13899g = f4;
            c();
        }
    }

    public void setTranslateX(float f4) {
        if (f4 != this.f13900h) {
            this.f13900h = f4;
            c();
        }
    }

    public void setTranslateY(float f4) {
        if (f4 != this.f13901i) {
            this.f13901i = f4;
            c();
        }
    }
}
