package com.google.firebase.storage;

import com.google.android.gms.internal.play_billing.B;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import w3.InterfaceC2053a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f12551a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final d3.g f12552b;
    public final InterfaceC2053a c;
    public final InterfaceC2053a d;

    public c(d3.g gVar, InterfaceC2053a interfaceC2053a, InterfaceC2053a interfaceC2053a2, Executor executor, Executor executor2) {
        this.f12552b = gVar;
        this.c = interfaceC2053a;
        this.d = interfaceC2053a2;
        B.f12128a = new o3.i(executor, 5);
        new LinkedBlockingQueue();
        new Semaphore(3, true);
        B.f12129b = new o3.i(executor, 2);
        B.c = new o3.k(executor);
        B.d = executor2;
    }
}
