package com.google.android.gms.internal.ads;

import android.content.Context;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.rm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1130rm implements InterfaceC0570ei {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10521o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0873lm f10522p;

    public /* synthetic */ C1130rm(C0873lm c0873lm, int i4) {
        this.f10521o = i4;
        this.f10522p = c0873lm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0570ei
    public final void j(boolean z4, Context context, Og og) {
        Exception exc;
        switch (this.f10521o) {
            case 0:
                Object obj = this.f10522p.f9463b;
                try {
                    ((Pp) obj).b(z4);
                    try {
                        ((Pp) obj).f6603a.M2(new BinderC1813b(context));
                        return;
                    } finally {
                    }
                } catch (Kp e4) {
                    throw new Exception(e4.getCause());
                }
            default:
                Object obj2 = this.f10522p.f9463b;
                try {
                    ((Pp) obj2).b(z4);
                    try {
                        ((Pp) obj2).f6603a.V2();
                        return;
                    } finally {
                    }
                } catch (Kp e5) {
                    Y9.t("Cannot show rewarded video.", e5);
                    throw new Exception(e5.getCause());
                }
        }
    }
}
