package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.mc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0906mc {

    /* renamed from: a, reason: collision with root package name */
    public final C1798a f9616a;

    /* renamed from: b, reason: collision with root package name */
    public final C1163sc f9617b;

    /* renamed from: e, reason: collision with root package name */
    public final String f9618e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9619f;
    public final Object d = new Object();

    /* renamed from: g, reason: collision with root package name */
    public long f9620g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f9621h = -1;

    /* renamed from: i, reason: collision with root package name */
    public long f9622i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f9623j = -1;

    /* renamed from: k, reason: collision with root package name */
    public long f9624k = -1;
    public final LinkedList c = new LinkedList();

    public C0906mc(C1798a c1798a, C1163sc c1163sc, String str, String str2) {
        this.f9616a = c1798a;
        this.f9617b = c1163sc;
        this.f9618e = str;
        this.f9619f = str2;
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.d) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.f9618e);
                bundle.putString("slotid", this.f9619f);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.f9623j);
                bundle.putLong("tresponse", this.f9624k);
                bundle.putLong("timp", this.f9620g);
                bundle.putLong("tload", this.f9621h);
                bundle.putLong("pcc", this.f9622i);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    C0863lc c0863lc = (C0863lc) it.next();
                    c0863lc.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("topen", c0863lc.f9434a);
                    bundle2.putLong("tclose", c0863lc.f9435b);
                    arrayList.add(bundle2);
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }
}
