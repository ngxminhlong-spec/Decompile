package l0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class j extends i {

    /* renamed from: a, reason: collision with root package name */
    public A.e[] f13904a;

    /* renamed from: b, reason: collision with root package name */
    public String f13905b;
    public int c;

    public j() {
        this.f13904a = null;
        this.c = 0;
    }

    public j(j jVar) {
        this.f13904a = null;
        this.c = 0;
        this.f13905b = jVar.f13905b;
        this.f13904a = android.support.v4.media.session.a.f(jVar.f13904a);
    }

    public A.e[] getPathData() {
        return this.f13904a;
    }

    public String getPathName() {
        return this.f13905b;
    }

    public void setPathData(A.e[] eVarArr) {
        if (!android.support.v4.media.session.a.b(this.f13904a, eVarArr)) {
            this.f13904a = android.support.v4.media.session.a.f(eVarArr);
            return;
        }
        A.e[] eVarArr2 = this.f13904a;
        for (int i4 = 0; i4 < eVarArr.length; i4++) {
            eVarArr2[i4].f3a = eVarArr[i4].f3a;
            int i5 = 0;
            while (true) {
                float[] fArr = eVarArr[i4].f4b;
                if (i5 < fArr.length) {
                    eVarArr2[i4].f4b[i5] = fArr[i5];
                    i5++;
                }
            }
        }
    }
}
