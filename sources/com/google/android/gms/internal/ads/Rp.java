package com.google.android.gms.internal.ads;

import O1.C0101z0;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Rp implements Lg {

    /* renamed from: o, reason: collision with root package name */
    public final HashSet f6853o = new HashSet();

    /* renamed from: p, reason: collision with root package name */
    public final Context f6854p;

    /* renamed from: q, reason: collision with root package name */
    public final C1163sc f6855q;

    public Rp(Context context, C1163sc c1163sc) {
        this.f6854p = context;
        this.f6855q = c1163sc;
    }

    @Override // com.google.android.gms.internal.ads.Lg
    public final synchronized void J(C0101z0 c0101z0) {
        if (c0101z0.f1405o != 3) {
            this.f6855q.g(this.f6853o);
        }
    }

    public final Bundle a() {
        C1163sc c1163sc = this.f6855q;
        Context context = this.f6854p;
        c1163sc.getClass();
        HashSet hashSet = new HashSet();
        synchronized (c1163sc.f10603a) {
            hashSet.addAll(c1163sc.f10605e);
            c1163sc.f10605e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", c1163sc.d.b(context, c1163sc.c.n()));
        Bundle bundle2 = new Bundle();
        Iterator it = c1163sc.f10606f.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C0906mc) it2.next()).a());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        b(hashSet);
        return bundle;
    }

    public final synchronized void b(HashSet hashSet) {
        this.f6853o.clear();
        this.f6853o.addAll(hashSet);
    }
}
