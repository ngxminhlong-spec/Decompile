package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.cr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0494cr {

    /* renamed from: a, reason: collision with root package name */
    public final C1050pr f8419a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8420b;
    public final Tq c = Tq.f7090o;
    public final String d = "Ad overlay";

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.pr, java.lang.ref.WeakReference] */
    public C0494cr(View view) {
        this.f8419a = new WeakReference(view);
        this.f8420b = view.getClass().getCanonicalName();
    }
}
