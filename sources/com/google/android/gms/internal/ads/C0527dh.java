package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.dh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0527dh extends AA implements Y7 {

    /* renamed from: q, reason: collision with root package name */
    public final Bundle f8496q;

    public C0527dh(Set set) {
        super(set);
        this.f8496q = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.Y7
    public final synchronized void l(Bundle bundle, String str) {
        this.f8496q.putAll(bundle);
        n1(BF.N);
    }
}
