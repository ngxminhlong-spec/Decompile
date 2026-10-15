package f;

import android.view.Window;
import k.y;
import l.P;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class k implements P, y {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q f12847o;

    @Override // k.y
    public void a(k.m mVar, boolean z4) {
        p pVar;
        k.m k3 = mVar.k();
        int i4 = 0;
        boolean z5 = k3 != mVar;
        if (z5) {
            mVar = k3;
        }
        q qVar = this.f12847o;
        p[] pVarArr = qVar.f12889T;
        int length = pVarArr != null ? pVarArr.length : 0;
        while (true) {
            if (i4 < length) {
                pVar = pVarArr[i4];
                if (pVar != null && pVar.f12859h == mVar) {
                    break;
                } else {
                    i4++;
                }
            } else {
                pVar = null;
                break;
            }
        }
        if (pVar != null) {
            if (!z5) {
                qVar.n(pVar, z4);
            } else {
                qVar.l(pVar.f12854a, pVar, k3);
                qVar.n(pVar, true);
            }
        }
    }

    @Override // k.y
    public boolean d(k.m mVar) {
        Window.Callback callback;
        if (mVar != null) {
            return true;
        }
        q qVar = this.f12847o;
        if (!qVar.N || (callback = qVar.f12910t.getCallback()) == null || qVar.f12894Y) {
            return true;
        }
        callback.onMenuOpened(108, mVar);
        return true;
    }
}
