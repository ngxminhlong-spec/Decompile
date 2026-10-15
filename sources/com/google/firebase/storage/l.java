package com.google.firebase.storage;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Exception f12576a;

    public l(m mVar, d dVar, long j4) {
        if (dVar != null) {
            this.f12576a = dVar;
            return;
        }
        if (mVar.h()) {
            this.f12576a = d.a(Status.f3897u);
        } else if (mVar.f12568h == 64) {
            this.f12576a = d.a(Status.f3895s);
        } else {
            this.f12576a = null;
        }
    }
}
