package com.google.android.gms.internal.ads;

import android.os.AsyncTask;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.mr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractAsyncTaskC0921mr extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public Op f9659a;

    /* renamed from: b, reason: collision with root package name */
    public final C0831kn f9660b;

    public AbstractAsyncTaskC0921mr(C0831kn c0831kn) {
        this.f9660b = c0831kn;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        Op op = this.f9659a;
        if (op != null) {
            op.f6527r = null;
            AbstractAsyncTaskC0921mr abstractAsyncTaskC0921mr = (AbstractAsyncTaskC0921mr) ((ArrayDeque) op.f6526q).poll();
            op.f6527r = abstractAsyncTaskC0921mr;
            if (abstractAsyncTaskC0921mr != null) {
                abstractAsyncTaskC0921mr.executeOnExecutor((ThreadPoolExecutor) op.f6525p, new Object[0]);
            }
        }
    }
}
