package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.or, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AsyncTaskC1007or extends AbstractAsyncTaskC0921mr {
    public final HashSet c;
    public final JSONObject d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9862f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC1007or(C0831kn c0831kn, HashSet hashSet, JSONObject jSONObject, long j4, int i4) {
        super(c0831kn);
        this.f9862f = i4;
        this.c = new HashSet(hashSet);
        this.d = jSONObject;
        this.f9861e = j4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC0921mr
    /* renamed from: a */
    public final void onPostExecute(String str) {
        Zq zq;
        switch (this.f9862f) {
            case 0:
                b(str);
                super.onPostExecute(str);
                return;
            default:
                if (!TextUtils.isEmpty(str) && (zq = Zq.c) != null) {
                    for (Rq rq : Collections.unmodifiableCollection(zq.f8055a)) {
                        if (this.c.contains(rq.f6861g)) {
                            AbstractC0579er abstractC0579er = rq.d;
                            if (this.f9861e >= abstractC0579er.f8650b) {
                                abstractC0579er.c = 2;
                                Zf.B(abstractC0579er.a(), "setNativeViewHierarchy", str);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                return;
        }
    }

    public void b(String str) {
        Zq zq = Zq.c;
        if (zq != null) {
            for (Rq rq : Collections.unmodifiableCollection(zq.f8055a)) {
                if (this.c.contains(rq.f6861g)) {
                    AbstractC0579er abstractC0579er = rq.d;
                    if (this.f9861e >= abstractC0579er.f8650b && abstractC0579er.c != 3) {
                        abstractC0579er.c = 3;
                        Zf.B(abstractC0579er.a(), "setNativeViewHierarchy", str);
                    }
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        switch (this.f9862f) {
            case 0:
                return this.d.toString();
            default:
                C0831kn c0831kn = this.f9660b;
                JSONObject jSONObject = (JSONObject) c0831kn.f9319p;
                JSONObject jSONObject2 = this.d;
                if (AbstractC0750ir.e(jSONObject2, jSONObject)) {
                    return null;
                }
                c0831kn.f9319p = jSONObject2;
                return jSONObject2.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC0921mr, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f9862f) {
            case 0:
                String str = (String) obj;
                b(str);
                super.onPostExecute(str);
                return;
            default:
                onPostExecute((String) obj);
                return;
        }
    }
}
