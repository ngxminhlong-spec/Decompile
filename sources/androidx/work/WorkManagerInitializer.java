package androidx.work;

import V2.e;
import android.content.Context;
import i0.InterfaceC1714b;
import java.util.Collections;
import java.util.List;
import n0.c;
import n0.n;
import o0.l;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements InterfaceC1714b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3125a = n.h("WrkMgrInitializer");

    @Override // i0.InterfaceC1714b
    public final void a() {
        List list = Collections.EMPTY_LIST;
    }

    @Override // i0.InterfaceC1714b
    public final Object b(Context context) {
        n.d().a(f3125a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        l.O(context, new c(new e(22)));
        return l.N(context);
    }
}
