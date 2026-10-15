package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.SparseArray;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Tl extends AbstractC0287Ic {

    /* renamed from: h, reason: collision with root package name */
    public static final SparseArray f7071h;
    public final Context c;
    public final V2.j d;

    /* renamed from: e, reason: collision with root package name */
    public final TelephonyManager f7072e;

    /* renamed from: f, reason: collision with root package name */
    public final Rl f7073f;

    /* renamed from: g, reason: collision with root package name */
    public int f7074g;

    static {
        SparseArray sparseArray = new SparseArray();
        f7071h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), Q5.f6640r);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        Q5 q5 = Q5.f6639q;
        sparseArray.put(ordinal, q5);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), q5);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), q5);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), Q5.f6641s);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        Q5 q52 = Q5.f6642t;
        sparseArray.put(ordinal2, q52);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), q52);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), q52);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), q52);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), q52);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), Q5.f6643u);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), q5);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), q5);
    }

    public Tl(Context context, V2.j jVar, Rl rl, C0258Da c0258Da, Q1.K k3) {
        super(c0258Da, k3);
        this.c = context;
        this.d = jVar;
        this.f7073f = rl;
        this.f7072e = (TelephonyManager) context.getSystemService("phone");
    }
}
