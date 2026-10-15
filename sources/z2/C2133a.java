package z2;

import N1.l;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import f2.g;
import f2.h;
import h2.AbstractC1709h;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: z2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2133a extends AbstractC1709h implements f2.c {
    public final boolean N;

    /* renamed from: O, reason: collision with root package name */
    public final l f15967O;

    /* renamed from: P, reason: collision with root package name */
    public final Bundle f15968P;

    /* renamed from: Q, reason: collision with root package name */
    public final Integer f15969Q;

    public C2133a(Context context, Looper looper, l lVar, Bundle bundle, g gVar, h hVar) {
        super(context, looper, 44, lVar, gVar, hVar);
        this.N = true;
        this.f15967O = lVar;
        this.f15968P = bundle;
        this.f15969Q = (Integer) lVar.f1194u;
    }

    @Override // h2.AbstractC1706e
    public final int f() {
        return 12451000;
    }

    @Override // h2.AbstractC1706e, f2.c
    public final boolean l() {
        return this.N;
    }

    @Override // h2.AbstractC1706e
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new AbstractC1106r4(iBinder, "com.google.android.gms.signin.internal.ISignInService", 2);
    }

    @Override // h2.AbstractC1706e
    public final Bundle r() {
        l lVar = this.f15967O;
        boolean equals = this.f13176q.getPackageName().equals((String) lVar.f1190q);
        Bundle bundle = this.f15968P;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) lVar.f1190q);
        }
        return bundle;
    }

    @Override // h2.AbstractC1706e
    public final String u() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // h2.AbstractC1706e
    public final String v() {
        return "com.google.android.gms.signin.service.START";
    }
}
