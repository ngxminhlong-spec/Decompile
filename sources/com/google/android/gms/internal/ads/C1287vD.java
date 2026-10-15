package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.vD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1287vD extends AudioTrack$StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0882lv f11022a;

    public C1287vD(C0882lv c0882lv) {
        this.f11022a = c0882lv;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i4) {
        C1330wD c1330wD;
        RC rc;
        C0900mC c0900mC;
        if (audioTrack.equals(((C1330wD) this.f11022a.f9506p).f11160p) && (rc = (c1330wD = (C1330wD) this.f11022a.f9506p).f11156l) != null && c1330wD.f11139M && (c0900mC = ((C1416yD) rc.f6796o).f11351W0) != null) {
            c0900mC.f9574a.f9953v.c(2);
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        C1330wD c1330wD;
        RC rc;
        C0900mC c0900mC;
        if (audioTrack.equals(((C1330wD) this.f11022a.f9506p).f11160p) && (rc = (c1330wD = (C1330wD) this.f11022a.f9506p).f11156l) != null && c1330wD.f11139M && (c0900mC = ((C1416yD) rc.f6796o).f11351W0) != null) {
            c0900mC.f9574a.f9953v.c(2);
        }
    }
}
