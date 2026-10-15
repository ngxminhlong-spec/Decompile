package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Y0 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11852a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y0(Handler handler, int i4) {
        super(handler);
        this.f11852a = i4;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4) {
        switch (this.f11852a) {
            case 0:
                Z0.d.set(true);
                return;
            default:
                C1535j1.f11949i.incrementAndGet();
                return;
        }
    }
}
