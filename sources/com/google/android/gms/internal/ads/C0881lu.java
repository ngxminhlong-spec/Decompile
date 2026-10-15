package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.lu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0881lu extends Bs {
    @Override // com.google.android.gms.internal.ads.Bs
    public final void Q(C1096qu c1096qu, C1096qu c1096qu2) {
        c1096qu.f10425b = c1096qu2;
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final void V(C1096qu c1096qu, Thread thread) {
        c1096qu.f10424a = thread;
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final boolean b0(AbstractC1138ru abstractC1138ru, C0752iu c0752iu, C0752iu c0752iu2) {
        synchronized (abstractC1138ru) {
            try {
                if (abstractC1138ru.f10549p != c0752iu) {
                    return false;
                }
                abstractC1138ru.f10549p = c0752iu2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final boolean e0(AbstractC1138ru abstractC1138ru, Object obj, Object obj2) {
        synchronized (abstractC1138ru) {
            try {
                if (abstractC1138ru.f10548o != obj) {
                    return false;
                }
                abstractC1138ru.f10548o = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final C0752iu f(AbstractC1138ru abstractC1138ru) {
        C0752iu c0752iu;
        C0752iu c0752iu2 = C0752iu.d;
        synchronized (abstractC1138ru) {
            try {
                c0752iu = abstractC1138ru.f10549p;
                if (c0752iu != c0752iu2) {
                    abstractC1138ru.f10549p = c0752iu2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0752iu;
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final boolean g0(AbstractC1138ru abstractC1138ru, C1096qu c1096qu, C1096qu c1096qu2) {
        synchronized (abstractC1138ru) {
            try {
                if (abstractC1138ru.f10550q != c1096qu) {
                    return false;
                }
                abstractC1138ru.f10550q = c1096qu2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final C1096qu z(AbstractC1138ru abstractC1138ru) {
        C1096qu c1096qu;
        C1096qu c1096qu2 = C1096qu.c;
        synchronized (abstractC1138ru) {
            try {
                c1096qu = abstractC1138ru.f10550q;
                if (c1096qu != c1096qu2) {
                    abstractC1138ru.f10550q = c1096qu2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1096qu;
    }
}
