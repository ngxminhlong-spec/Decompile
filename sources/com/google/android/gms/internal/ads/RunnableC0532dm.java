package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.dm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0532dm implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8506o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Pq f8507p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ View f8508q;

    public /* synthetic */ RunnableC0532dm(Pq pq, View view, int i4) {
        this.f8506o = i4;
        this.f8507p = pq;
        this.f8508q = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.google.android.gms.internal.ads.pr, java.lang.ref.WeakReference] */
    @Override // java.lang.Runnable
    public final void run() {
        View view;
        C0494cr c0494cr;
        switch (this.f8506o) {
            case 0:
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.r4)).booleanValue() && Wj.f7528E.f7724p) {
                    Rq rq = (Rq) this.f8507p;
                    ArrayList arrayList = rq.f6858b;
                    if (rq.f6860f) {
                        return;
                    }
                    if (!Rq.f6856h.matcher("Ad overlay").matches()) {
                        throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
                    }
                    int size = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        view = this.f8508q;
                        if (i4 < size) {
                            Object obj = arrayList.get(i4);
                            i4++;
                            c0494cr = (C0494cr) obj;
                            if (c0494cr.f8419a.get() == view) {
                            }
                        } else {
                            c0494cr = null;
                        }
                    }
                    if (c0494cr == null) {
                        arrayList.add(new C0494cr(view));
                        return;
                    }
                    return;
                }
                return;
            default:
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.r4)).booleanValue() && Wj.f7528E.f7724p) {
                    Rq rq2 = (Rq) this.f8507p;
                    if (rq2.f6860f) {
                        return;
                    }
                    View view2 = (View) rq2.c.get();
                    View view3 = this.f8508q;
                    if (view2 != view3) {
                        rq2.c = new WeakReference(view3);
                        AbstractC0579er abstractC0579er = rq2.d;
                        abstractC0579er.getClass();
                        abstractC0579er.f8650b = System.nanoTime();
                        abstractC0579er.c = 1;
                        Collection<Rq> unmodifiableCollection = Collections.unmodifiableCollection(Zq.c.f8055a);
                        if (unmodifiableCollection == null || unmodifiableCollection.isEmpty()) {
                            return;
                        }
                        for (Rq rq3 : unmodifiableCollection) {
                            if (rq3 != rq2 && ((View) rq3.c.get()) == view3) {
                                rq3.c.clear();
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
