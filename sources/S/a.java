package S;

import androidx.lifecycle.s;
import r.j;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class a extends s {
    public static final C2033d d = new C2033d(12);
    public final j c = new j();

    @Override // androidx.lifecycle.s
    public final void a() {
        j jVar = this.c;
        if (jVar.f() > 0) {
            jVar.g(0).getClass();
            throw new ClassCastException();
        }
        int i4 = jVar.f14745r;
        Object[] objArr = jVar.f14744q;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        jVar.f14745r = 0;
        jVar.f14742o = false;
    }
}
