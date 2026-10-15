package com.google.firebase.storage;

import A2.r;
import C0.x0;
import android.util.Log;
import com.google.android.gms.internal.ads.Iu;
import h2.y;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class h extends a {

    /* renamed from: j, reason: collision with root package name */
    public static final HashMap f12561j;

    /* renamed from: k, reason: collision with root package name */
    public static final HashMap f12562k;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f12564b;
    public final x0 c;
    public final x0 d;

    /* renamed from: e, reason: collision with root package name */
    public final x0 f12565e;

    /* renamed from: i, reason: collision with root package name */
    public l f12569i;

    /* renamed from: a, reason: collision with root package name */
    public final Object f12563a = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final x0 f12566f = new x0(this, -465, new D3.b(3));

    /* renamed from: g, reason: collision with root package name */
    public final x0 f12567g = new x0(this, 16, new D3.b(4));

    /* renamed from: h, reason: collision with root package name */
    public volatile int f12568h = 1;

    static {
        HashMap hashMap = new HashMap();
        f12561j = hashMap;
        HashMap hashMap2 = new HashMap();
        f12562k = hashMap2;
        hashMap.put(1, new HashSet(Arrays.asList(16, 256)));
        hashMap.put(2, new HashSet(Arrays.asList(8, 32)));
        hashMap.put(4, new HashSet(Arrays.asList(8, 32)));
        hashMap.put(16, new HashSet(Arrays.asList(2, 256)));
        hashMap.put(64, new HashSet(Arrays.asList(2, 256)));
        hashMap2.put(1, new HashSet(Arrays.asList(2, 64)));
        hashMap2.put(2, new HashSet(Arrays.asList(4, 64, 128)));
        hashMap2.put(4, new HashSet(Arrays.asList(4, 64, 128)));
        hashMap2.put(8, new HashSet(Arrays.asList(16, 64, 128)));
        hashMap2.put(32, new HashSet(Arrays.asList(256, 64, 128)));
    }

    public h() {
        final int i4 = 0;
        this.f12564b = new x0(this, 128, new k(this) { // from class: com.google.firebase.storage.f

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ h f12558p;

            {
                this.f12558p = this;
            }

            @Override // com.google.firebase.storage.k
            public final void a(Object obj, l lVar) {
                switch (i4) {
                    case 0:
                        i.c.b(this.f12558p);
                        ((A2.f) obj).b(lVar);
                        return;
                    case 1:
                        i.c.b(this.f12558p);
                        ((A2.e) obj).c(lVar.f12576a);
                        return;
                    case 2:
                        i iVar = i.c;
                        h hVar = this.f12558p;
                        iVar.b(hVar);
                        ((A2.d) obj).a(hVar);
                        return;
                    default:
                        i.c.b(this.f12558p);
                        ((A2.c) obj).a();
                        return;
                }
            }
        });
        final int i5 = 1;
        this.c = new x0(this, 64, new k(this) { // from class: com.google.firebase.storage.f

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ h f12558p;

            {
                this.f12558p = this;
            }

            @Override // com.google.firebase.storage.k
            public final void a(Object obj, l lVar) {
                switch (i5) {
                    case 0:
                        i.c.b(this.f12558p);
                        ((A2.f) obj).b(lVar);
                        return;
                    case 1:
                        i.c.b(this.f12558p);
                        ((A2.e) obj).c(lVar.f12576a);
                        return;
                    case 2:
                        i iVar = i.c;
                        h hVar = this.f12558p;
                        iVar.b(hVar);
                        ((A2.d) obj).a(hVar);
                        return;
                    default:
                        i.c.b(this.f12558p);
                        ((A2.c) obj).a();
                        return;
                }
            }
        });
        final int i6 = 2;
        this.d = new x0(this, 448, new k(this) { // from class: com.google.firebase.storage.f

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ h f12558p;

            {
                this.f12558p = this;
            }

            @Override // com.google.firebase.storage.k
            public final void a(Object obj, l lVar) {
                switch (i6) {
                    case 0:
                        i.c.b(this.f12558p);
                        ((A2.f) obj).b(lVar);
                        return;
                    case 1:
                        i.c.b(this.f12558p);
                        ((A2.e) obj).c(lVar.f12576a);
                        return;
                    case 2:
                        i iVar = i.c;
                        h hVar = this.f12558p;
                        iVar.b(hVar);
                        ((A2.d) obj).a(hVar);
                        return;
                    default:
                        i.c.b(this.f12558p);
                        ((A2.c) obj).a();
                        return;
                }
            }
        });
        final int i7 = 3;
        this.f12565e = new x0(this, 256, new k(this) { // from class: com.google.firebase.storage.f

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ h f12558p;

            {
                this.f12558p = this;
            }

            @Override // com.google.firebase.storage.k
            public final void a(Object obj, l lVar) {
                switch (i7) {
                    case 0:
                        i.c.b(this.f12558p);
                        ((A2.f) obj).b(lVar);
                        return;
                    case 1:
                        i.c.b(this.f12558p);
                        ((A2.e) obj).c(lVar.f12576a);
                        return;
                    case 2:
                        i iVar = i.c;
                        h hVar = this.f12558p;
                        iVar.b(hVar);
                        ((A2.d) obj).a(hVar);
                        return;
                    default:
                        i.c.b(this.f12558p);
                        ((A2.c) obj).a();
                        return;
                }
            }
        });
    }

    public static String m(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 4 ? i4 != 8 ? i4 != 16 ? i4 != 32 ? i4 != 64 ? i4 != 128 ? i4 != 256 ? "Unknown Internal State!" : "INTERNAL_STATE_CANCELED" : "INTERNAL_STATE_SUCCESS" : "INTERNAL_STATE_FAILURE" : "INTERNAL_STATE_CANCELING" : "INTERNAL_STATE_PAUSED" : "INTERNAL_STATE_PAUSING" : "INTERNAL_STATE_IN_PROGRESS" : "INTERNAL_STATE_QUEUED" : "INTERNAL_STATE_NOT_STARTED";
    }

    @Override // A2.h
    public final A2.h a(Executor executor, A2.c cVar) {
        y.i(executor);
        this.f12565e.a(cVar, executor);
        return this;
    }

    @Override // A2.h
    public final A2.h b(Executor executor, A2.d dVar) {
        this.d.a(dVar, Iu.f5747o);
        return this;
    }

    @Override // A2.h
    public final A2.h c(Executor executor, A2.e eVar) {
        y.i(executor);
        this.c.a(eVar, executor);
        return this;
    }

    @Override // A2.h
    public final A2.h d(Executor executor, A2.f fVar) {
        y.i(executor);
        this.f12564b.a(fVar, executor);
        return this;
    }

    @Override // A2.h
    public final r e(Executor executor, final A2.a aVar) {
        final A2.i iVar = new A2.i();
        this.d.a(new A2.d() { // from class: com.google.firebase.storage.g
            @Override // A2.d
            public final void a(A2.h hVar) {
                h hVar2 = h.this;
                A2.a aVar2 = aVar;
                A2.i iVar2 = iVar;
                try {
                    Object e4 = aVar2.e(hVar2);
                    if (iVar2.f26a.i()) {
                        return;
                    }
                    iVar2.b(e4);
                } catch (A2.g e5) {
                    if (e5.getCause() instanceof Exception) {
                        iVar2.a((Exception) e5.getCause());
                    } else {
                        iVar2.a(e5);
                    }
                } catch (Exception e6) {
                    iVar2.a(e6);
                }
            }
        }, executor);
        return iVar.f26a;
    }

    @Override // A2.h
    public final Exception f() {
        if (l() == null) {
            return null;
        }
        return l().f12576a;
    }

    @Override // A2.h
    public final Object g() {
        if (l() == null) {
            throw new IllegalStateException();
        }
        Exception exc = l().f12576a;
        if (exc == null) {
            return l();
        }
        throw new RuntimeException(exc);
    }

    @Override // A2.h
    public final boolean h() {
        return this.f12568h == 256;
    }

    @Override // A2.h
    public final boolean i() {
        return (this.f12568h & 448) != 0;
    }

    @Override // A2.h
    public final boolean j() {
        return (this.f12568h & 128) != 0;
    }

    public final void k() {
        if (i() || (this.f12568h & 16) != 0 || this.f12568h == 2 || p(256)) {
            return;
        }
        p(64);
    }

    public final l l() {
        l lVar = this.f12569i;
        if (lVar != null) {
            return lVar;
        }
        if (!i()) {
            return null;
        }
        if (this.f12569i == null) {
            this.f12569i = o();
        }
        return this.f12569i;
    }

    public abstract void n();

    public final l o() {
        l lVar;
        d dVar;
        synchronized (this.f12563a) {
            m mVar = (m) this;
            Exception exc = mVar.f12591v != null ? mVar.f12591v : mVar.f12592w;
            int i4 = mVar.f12593x;
            int i5 = d.f12553p;
            if (exc instanceof d) {
                dVar = (d) exc;
            } else if ((i4 == 0 || (i4 >= 200 && i4 < 300)) && exc == null) {
                dVar = null;
            } else {
                dVar = new d(i4 != -2 ? i4 != 401 ? i4 != 409 ? i4 != 403 ? i4 != 404 ? -13000 : -13010 : -13021 : -13031 : -13020 : -13030, exc, i4);
            }
            lVar = new l(mVar, dVar, mVar.f12584o.get());
        }
        return lVar;
    }

    public final boolean p(int i4) {
        return q(false, new int[]{i4});
    }

    public final boolean q(boolean z4, int[] iArr) {
        String substring;
        HashMap hashMap = z4 ? f12561j : f12562k;
        synchronized (this.f12563a) {
            try {
                for (int i4 : iArr) {
                    HashSet hashSet = (HashSet) hashMap.get(Integer.valueOf(this.f12568h));
                    if (hashSet != null && hashSet.contains(Integer.valueOf(i4))) {
                        this.f12568h = i4;
                        int i5 = this.f12568h;
                        if (i5 == 2) {
                            i.c.a(this);
                        } else if (i5 != 4 && i5 != 16 && i5 != 64 && i5 != 128 && i5 == 256) {
                            n();
                        }
                        this.f12564b.b();
                        this.c.b();
                        this.f12565e.b();
                        this.d.b();
                        this.f12567g.b();
                        this.f12566f.b();
                        if (Log.isLoggable("StorageTask", 3)) {
                            Log.d("StorageTask", "changed internal state to: " + m(i4) + " isUser: " + z4 + " from state:" + m(this.f12568h));
                        }
                        return true;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unable to change internal state to: ");
                if (iArr.length == 0) {
                    substring = "";
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i6 : iArr) {
                        sb2.append(m(i6));
                        sb2.append(", ");
                    }
                    substring = sb2.substring(0, sb2.length() - 2);
                }
                sb.append(substring);
                sb.append(" isUser: ");
                sb.append(z4);
                sb.append(" from state:");
                sb.append(m(this.f12568h));
                Log.w("StorageTask", sb.toString());
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
