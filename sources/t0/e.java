package t0;

import android.os.Build;
import n0.n;
import s0.C1970a;
import w0.i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e extends AbstractC1989c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f14841e = n.h("NetworkNotRoamingCtrlr");

    @Override // t0.AbstractC1989c
    public final boolean a(i iVar) {
        return iVar.f15122j.f14080a == 4;
    }

    @Override // t0.AbstractC1989c
    public final boolean b(Object obj) {
        C1970a c1970a = (C1970a) obj;
        if (Build.VERSION.SDK_INT >= 24) {
            return (c1970a.f14759a && c1970a.d) ? false : true;
        }
        n.d().a(f14841e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
        return !c1970a.f14759a;
    }
}
