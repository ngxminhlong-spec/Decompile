package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Yq extends C0452br {

    /* renamed from: r, reason: collision with root package name */
    public static final Yq f7900r = new Object();

    @Override // com.google.android.gms.internal.ads.C0452br
    public final void a(boolean z4) {
        Iterator it = Collections.unmodifiableCollection(Zq.c.f8055a).iterator();
        while (it.hasNext()) {
            AbstractC0579er abstractC0579er = ((Rq) it.next()).d;
            if (abstractC0579er.f8649a.get() != 0) {
                Zf.B(abstractC0579er.a(), "setState", true != z4 ? "backgrounded" : "foregrounded");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.C0452br
    public final boolean b() {
        Iterator it = Collections.unmodifiableCollection(Zq.c.f8056b).iterator();
        while (it.hasNext()) {
            View view = (View) ((Rq) it.next()).c.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
