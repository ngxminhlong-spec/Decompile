package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class T3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7043o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ U3 f7044p;

    public /* synthetic */ T3(U3 u32, int i4) {
        this.f7043o = i4;
        this.f7044p = u32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7043o) {
            case 0:
                U3 u32 = this.f7044p;
                try {
                    if (u32.f7130f == null && u32.f7133i) {
                        L1.b bVar = new L1.b(u32.f7127a, 30000L, false);
                        bVar.d(true);
                        u32.f7130f = bVar;
                        return;
                    }
                    return;
                } catch (e2.g | IOException unused) {
                    u32.f7130f = null;
                    return;
                }
            default:
                AbstractC1066q6.a(this.f7044p.f7127a);
                return;
        }
    }
}
