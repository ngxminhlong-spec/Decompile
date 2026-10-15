package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Bu extends AbstractC0967nu {

    /* renamed from: x, reason: collision with root package name */
    public static final Bs f4204x;
    public static final Logger y = Logger.getLogger(Bu.class.getName());

    /* renamed from: v, reason: collision with root package name */
    public volatile Set f4205v;

    /* renamed from: w, reason: collision with root package name */
    public volatile int f4206w;

    static {
        Bs bs;
        try {
            bs = new C1482zu(AtomicReferenceFieldUpdater.newUpdater(Bu.class, Set.class, "v"), AtomicIntegerFieldUpdater.newUpdater(Bu.class, "w"));
            e = null;
        } catch (Error | RuntimeException e4) {
            e = e4;
            bs = new Bs(17);
        }
        Throwable th = e;
        f4204x = bs;
        if (th != null) {
            y.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }
}
