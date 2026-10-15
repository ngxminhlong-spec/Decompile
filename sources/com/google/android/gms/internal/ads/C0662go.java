package com.google.android.gms.internal.ads;

import android.content.Context;
import c3.InterfaceFutureC0239a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.go, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0662go implements Go {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8867a;

    /* renamed from: b, reason: collision with root package name */
    public final Su f8868b;
    public final Context c;

    public C0662go(Context context, Su su) {
        this.f8867a = 2;
        this.c = context;
        this.f8868b = su;
    }

    public /* synthetic */ C0662go(Su su, Context context, int i4) {
        this.f8867a = i4;
        this.f8868b = su;
        this.c = context;
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final int b() {
        switch (this.f8867a) {
            case 0:
                return 13;
            case 1:
                return 14;
            case 2:
                return 18;
            case 3:
                return 37;
            case 4:
                return 38;
            default:
                return 39;
        }
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final InterfaceFutureC0239a c() {
        switch (this.f8867a) {
            case 0:
                return ((C0260Dc) this.f8868b).b(new CallableC0336Sb(10, this));
            case 1:
                return ((C0260Dc) this.f8868b).b(new CallableC0336Sb(11, this));
            case 2:
                return ((C0260Dc) this.f8868b).b(new CallableC0336Sb(13, this));
            case 3:
                return ((C0260Dc) this.f8868b).b(new CallableC0336Sb(22, this));
            case 4:
                return ((C0260Dc) this.f8868b).b(new CallableC0336Sb(23, this));
            default:
                return ((C0260Dc) this.f8868b).b(new CallableC0336Sb(24, this));
        }
    }
}
