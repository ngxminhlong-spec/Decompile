package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.vs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1308vs {

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f11078n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f11079a;

    /* renamed from: b, reason: collision with root package name */
    public final Iv f11080b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11083g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f11084h;

    /* renamed from: l, reason: collision with root package name */
    public ServiceConnectionC1265us f11088l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC0965ns f11089m;
    public final ArrayList d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f11081e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f11082f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final C1051ps f11086j = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.ps
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C1308vs c1308vs = C1308vs.this;
            int i4 = 0;
            c1308vs.f11080b.g("reportBinderDeath", new Object[0]);
            if (c1308vs.f11085i.get() != null) {
                throw new ClassCastException();
            }
            c1308vs.f11080b.g("%s : Binder has died.", c1308vs.c);
            ArrayList arrayList = c1308vs.d;
            int size = arrayList.size();
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                RemoteException remoteException = new RemoteException(String.valueOf(c1308vs.c).concat(" : Binder has died."));
                A2.i iVar = ((AbstractRunnableC1008os) obj).f9863o;
                if (iVar != null) {
                    iVar.c(remoteException);
                }
            }
            c1308vs.d.clear();
            synchronized (c1308vs.f11082f) {
                c1308vs.c();
            }
        }
    };

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f11087k = new AtomicInteger(0);
    public final String c = "OverlayDisplayService";

    /* renamed from: i, reason: collision with root package name */
    public final WeakReference f11085i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.ps] */
    public C1308vs(Context context, Iv iv, Intent intent) {
        this.f11079a = context;
        this.f11080b = iv;
        this.f11084h = intent;
    }

    public static void b(C1308vs c1308vs, AbstractRunnableC1008os abstractRunnableC1008os) {
        InterfaceC0965ns interfaceC0965ns = c1308vs.f11089m;
        Iv iv = c1308vs.f11080b;
        ArrayList arrayList = c1308vs.d;
        int i4 = 0;
        if (interfaceC0965ns != null || c1308vs.f11083g) {
            if (!c1308vs.f11083g) {
                abstractRunnableC1008os.run();
                return;
            } else {
                iv.g("Waiting to bind to the service.", new Object[0]);
                arrayList.add(abstractRunnableC1008os);
                return;
            }
        }
        iv.g("Initiate binding to the service.", new Object[0]);
        arrayList.add(abstractRunnableC1008os);
        ServiceConnectionC1265us serviceConnectionC1265us = new ServiceConnectionC1265us(c1308vs);
        c1308vs.f11088l = serviceConnectionC1265us;
        c1308vs.f11083g = true;
        if (c1308vs.f11079a.bindService(c1308vs.f11084h, serviceConnectionC1265us, 1)) {
            return;
        }
        iv.g("Failed to bind to the service.", new Object[0]);
        c1308vs.f11083g = false;
        int size = arrayList.size();
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            RuntimeException runtimeException = new RuntimeException("Failed to bind to the service.");
            A2.i iVar = ((AbstractRunnableC1008os) obj).f9863o;
            if (iVar != null) {
                iVar.c(runtimeException);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f11078n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    hashMap.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.f11081e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((A2.i) it.next()).c(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
