package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.fa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0605fa implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8702o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f8703p;

    public /* synthetic */ ViewOnClickListenerC0605fa(int i4, Object obj) {
        this.f8702o = i4;
        this.f8703p = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f8702o) {
            case 0:
                ((C0648ga) this.f8703p).K(true);
                return;
            default:
                ((Nj) this.f8703p).f6362j.f1153b = true;
                return;
        }
    }
}
