package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.work.impl.WorkDatabase_Impl;
import c0.C0229j;
import c1.C0237f;
import c1.InterfaceC0235d;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.AbstractC1515f1;
import com.google.android.gms.internal.measurement.C1493b;
import com.google.android.gms.internal.measurement.C1498c;
import com.google.android.gms.internal.measurement.C1518g;
import com.google.android.gms.internal.measurement.C1546m;
import com.google.android.gms.internal.measurement.InterfaceC1550n;
import com.google.android.gms.internal.measurement.InterfaceC1577u;
import d3.AbstractC1654b;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import k.C1748e;
import m.C1801a;
import n2.BinderC1813b;
import o2.AbstractC1895f;
import p1.AbstractC1906D;
import p1.C1924j;
import q1.C1947b;
import t2.C1995b;
import t2.C2000g;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class Wl implements InterfaceC0749iq, InterfaceC0791jq, Bh, InterfaceC0476cF, InterfaceC1577u, n0.s, InterfaceC0235d, b3.d, y1.b {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7562o;

    /* renamed from: p, reason: collision with root package name */
    public Object f7563p;

    /* renamed from: q, reason: collision with root package name */
    public Object f7564q;

    public Wl(int i4) {
        this.f7562o = 10;
        n0.n nVar = new n0.n(i4, 10);
        n0.n nVar2 = new n0.n(i4, 11);
        this.f7563p = nVar;
        this.f7564q = nVar2;
    }

    public Wl(int i4, byte b4) {
        com.google.firebase.storage.b a4;
        this.f7562o = i4;
        switch (i4) {
            case 5:
                return;
            case 13:
                this.f7563p = new TreeMap();
                this.f7564q = new TreeMap();
                return;
            case 14:
                this.f7563p = Collections.synchronizedMap(new WeakHashMap());
                this.f7564q = Collections.synchronizedMap(new WeakHashMap());
                return;
            case 16:
                d3.g b5 = d3.g.b();
                b5.a();
                d3.i iVar = b5.c;
                String str = iVar.f12632f;
                if (str == null) {
                    a4 = com.google.firebase.storage.b.a(b5, null);
                } else {
                    try {
                        StringBuilder sb = new StringBuilder("gs://");
                        b5.a();
                        sb.append(iVar.f12632f);
                        a4 = com.google.firebase.storage.b.a(b5, AbstractC1895f.s(sb.toString()));
                    } catch (UnsupportedEncodingException e4) {
                        Log.e("FirebaseStorage", "Unable to parse bucket:".concat(str), e4);
                        throw new IllegalArgumentException("The storage Uri could not be parsed.");
                    }
                }
                String str2 = a4.d;
                if (TextUtils.isEmpty(str2)) {
                    throw new IllegalStateException("FirebaseApp was not initialized with a bucket name.");
                }
                Uri build = new Uri.Builder().scheme("gs").authority(str2).path("/").build();
                h2.y.j(build, "uri must not be null");
                h2.y.a("The supplied bucketname does not match the storage bucket of the current instance.", TextUtils.isEmpty(str2) || build.getAuthority().equalsIgnoreCase(str2));
                this.f7563p = new com.google.firebase.storage.e(build, a4);
                this.f7564q = new Handler(Looper.getMainLooper());
                return;
            case 17:
                this.f7563p = new androidx.lifecycle.o();
                this.f7564q = new Object();
                e(n0.s.f14103n);
                return;
            default:
                C1384xi c1384xi = new C1384xi();
                this.f7563p = c1384xi;
                this.f7564q = new Xj(18, c1384xi);
                return;
        }
    }

    public Wl(int i4, int i5) {
        this.f7562o = 6;
        this.f7563p = i4 == 0 ? Collections.EMPTY_LIST : new ArrayList(i4);
        this.f7564q = i5 == 0 ? Collections.EMPTY_LIST : new ArrayList(i5);
    }

    public /* synthetic */ Wl(int i4, Object obj, Object obj2) {
        this.f7562o = i4;
        this.f7563p = obj;
        this.f7564q = obj2;
    }

    public Wl(Context context) {
        this.f7562o = 15;
        h2.y.i(context);
        Resources resources = context.getResources();
        this.f7563p = resources;
        this.f7564q = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public /* synthetic */ Wl(MediaCodec.CryptoInfo cryptoInfo) {
        this.f7562o = 7;
        this.f7563p = cryptoInfo;
        this.f7564q = D.g.b();
    }

    public Wl(WorkDatabase_Impl workDatabase_Impl, int i4) {
        this.f7562o = i4;
        switch (i4) {
            case 23:
                this.f7563p = workDatabase_Impl;
                this.f7564q = new w0.b(workDatabase_Impl, 6);
                return;
            default:
                this.f7563p = workDatabase_Impl;
                this.f7564q = new w0.b(workDatabase_Impl, 0);
                return;
        }
    }

    public Wl(Q0 q02, SparseArray sparseArray) {
        this.f7562o = 8;
        this.f7563p = q02;
        SparseBooleanArray sparseBooleanArray = q02.f6628a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i4 = 0; i4 < sparseBooleanArray.size(); i4++) {
            int a4 = q02.a(i4);
            OC oc = (OC) sparseArray.get(a4);
            oc.getClass();
            sparseArray2.append(a4, oc);
        }
        this.f7564q = sparseArray2;
    }

    public /* synthetic */ Wl(Object obj, Object obj2, int i4, boolean z4) {
        this.f7562o = i4;
        this.f7564q = obj;
        this.f7563p = obj2;
    }

    public ArrayList a(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f7563p;
        C0229j d = C0229j.d("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            d.f(1);
        } else {
            d.g(str, 1);
        }
        workDatabase_Impl.b();
        Cursor g4 = workDatabase_Impl.g(d);
        try {
            ArrayList arrayList = new ArrayList(g4.getCount());
            while (g4.moveToNext()) {
                arrayList.add(g4.getString(0));
            }
            return arrayList;
        } finally {
            g4.close();
            d.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0791jq
    public void b() {
        Cm cm = (Cm) this.f7563p;
        BinderC1366x6 binderC1366x6 = (BinderC1366x6) this.f7564q;
        C1409y6 c1409y6 = (C1409y6) cm.f4542e;
        Parcel Q3 = c1409y6.Q();
        AbstractC1192t4.e(Q3, binderC1366x6);
        c1409y6.G1(Q3, 1);
    }

    public String c(String str) {
        String str2 = (String) this.f7564q;
        Resources resources = (Resources) this.f7563p;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public ArrayList d(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f7563p;
        C0229j d = C0229j.d("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            d.f(1);
        } else {
            d.g(str, 1);
        }
        workDatabase_Impl.b();
        Cursor g4 = workDatabase_Impl.g(d);
        try {
            ArrayList arrayList = new ArrayList(g4.getCount());
            while (g4.moveToNext()) {
                arrayList.add(g4.getString(0));
            }
            return arrayList;
        } finally {
            g4.close();
            d.h();
        }
    }

    public void e(AbstractC1654b abstractC1654b) {
        boolean z4;
        androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.f7563p;
        synchronized (oVar.f2985a) {
            z4 = oVar.d == androidx.lifecycle.o.f2984h;
            oVar.d = abstractC1654b;
        }
        if (z4) {
            C1801a.j0().k0(oVar.f2989g);
        }
        if (abstractC1654b instanceof n0.r) {
            ((y0.j) this.f7564q).i((n0.r) abstractC1654b);
        } else if (abstractC1654b instanceof n0.p) {
            ((y0.j) this.f7564q).j(((n0.p) abstractC1654b).f14101h);
        }
    }

    @Override // b3.d
    public void f(C2000g c2000g) {
        c2000g.a((Activity) this.f7563p, (C1947b) this.f7564q);
    }

    public void g(boolean z4, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f7563p)) {
            hashMap = new HashMap((Map) this.f7563p);
        }
        synchronized (((Map) this.f7564q)) {
            hashMap2 = new HashMap((Map) this.f7564q);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z4 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z4 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((A2.i) entry2.getKey()).c(new f2.d(status));
            }
        }
    }

    @Override // I3.a
    public Object get() {
        return new x1.d((Context) ((t2.G) this.f7563p).f14862o, (t3.g) ((C1748e) this.f7564q).get());
    }

    public void h(FB fb) {
        ((List) this.f7564q).add(fb);
    }

    public void i(FB fb) {
        ((List) this.f7563p).add(fb);
    }

    public void j(u0.g gVar, C1498c c1498c) {
        TreeMap treeMap = (TreeMap) this.f7564q;
        com.google.android.gms.internal.measurement.X1 x12 = new com.google.android.gms.internal.measurement.X1(c1498c);
        TreeMap treeMap2 = (TreeMap) this.f7563p;
        for (Integer num : treeMap2.keySet()) {
            C1493b clone = c1498c.f11890b.clone();
            InterfaceC1550n a4 = ((C1546m) treeMap2.get(num)).a(gVar, Collections.singletonList(x12));
            int g4 = a4 instanceof C1518g ? AbstractC1515f1.g(((C1518g) a4).f11934o.doubleValue()) : -1;
            if (g4 == 2 || g4 == -1) {
                c1498c.f11890b = clone;
            }
        }
        Iterator it = treeMap.keySet().iterator();
        while (it.hasNext()) {
            InterfaceC1550n a5 = ((C1546m) treeMap.get((Integer) it.next())).a(gVar, Collections.singletonList(x12));
            if (a5 instanceof C1518g) {
                AbstractC1515f1.g(((C1518g) a5).f11934o.doubleValue());
            }
        }
    }

    @Override // c1.InterfaceC0235d
    public void k(boolean z4) {
        switch (this.f7562o) {
            case 18:
                C1924j c1924j = (C1924j) this.f7564q;
                int indexOf = c1924j.f14551Q.indexOf((C0237f) this.f7563p);
                for (int i4 = 0; i4 < c1924j.f14550P.size(); i4++) {
                    Boolean bool = (Boolean) ((C0237f) c1924j.f14550P.get(i4)).f1252p;
                    c1924j.f14553S[indexOf][i4] = z4 && bool != null && bool.booleanValue();
                }
                return;
            case 19:
                AbstractC1906D abstractC1906D = (AbstractC1906D) this.f7564q;
                C0237f c0237f = abstractC1906D.f14399X;
                C0237f c0237f2 = abstractC1906D.f14398W;
                C0237f c0237f3 = (C0237f) this.f7563p;
                if (c0237f2 == c0237f3 || c0237f == c0237f3) {
                    Object obj = c0237f2.f1252p;
                    boolean z5 = obj != null && ((Boolean) obj).booleanValue();
                    Object obj2 = c0237f.f1252p;
                    boolean z6 = obj2 != null && ((Boolean) obj2).booleanValue();
                    if (z5 ^ z6) {
                        abstractC1906D.P(z5, z6);
                    } else if (z5) {
                        abstractC1906D.P(false, false);
                    }
                }
                abstractC1906D.O(c0237f3);
                return;
            default:
                p1.j0 j0Var = (p1.j0) this.f7564q;
                if (j0Var.f14556Q == z4) {
                    return;
                }
                j0Var.f14556Q = z4;
                ((e1.g) ((C1995b) this.f7563p).f14885t).d(j0Var.f13120D, z4);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0749iq
    public Object l(Object obj) {
        Xl xl = (Xl) this.f7563p;
        N2 n22 = (N2) this.f7564q;
        xl.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(n22.f6302a));
        contentValues.put("gws_query_id", (String) n22.c);
        contentValues.put("url", (String) n22.d);
        contentValues.put("event_state", Integer.valueOf(n22.f6303b - 1));
        ((SQLiteDatabase) obj).insert("offline_buffered_pings", null, contentValues);
        Q1.N n4 = N1.n.f1204A.c;
        Context context = xl.f7689o;
        Q1.x H3 = Q1.N.H(context);
        if (H3 != null) {
            try {
                H3.zze(new BinderC1813b(context));
            } catch (RemoteException e4) {
                Q1.I.x("Failed to schedule offline ping sender.", e4);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Bh
    /* renamed from: l */
    public void mo3l(Object obj) {
        C0834kq c0834kq = (C0834kq) this.f7563p;
        ((InterfaceC1049pq) obj).r((EnumC0877lq) c0834kq.f9323o, c0834kq.f9324p, (Throwable) this.f7564q);
    }

    public DB m() {
        return new DB((List) this.f7563p, (List) this.f7564q);
    }

    public HD n(OD od) {
        MediaCodec mediaCodec;
        String str = od.f6451a.f6957a;
        HD hd = null;
        try {
            int i4 = AbstractC0751is.f9071a;
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                HD hd2 = new HD(mediaCodec, new HandlerThread(HD.o("ExoPlayer:MediaCodecAsyncAdapter:", ((n0.n) this.f7563p).f14098p)), new HandlerThread(HD.o("ExoPlayer:MediaCodecQueueingThread:", ((n0.n) this.f7564q).f14098p)));
                try {
                    Trace.endSection();
                    HD.h(hd2, od.f6452b, od.d);
                    return hd2;
                } catch (Exception e4) {
                    e = e4;
                    hd = hd2;
                    if (hd != null) {
                        hd.l();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Exception e6) {
            e = e6;
            mediaCodec = null;
        }
    }

    public boolean o(int i4) {
        return ((Q0) this.f7563p).f6628a.get(i4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0476cF
    public Gt p(int i4, C0997oh c0997oh, int[] iArr) {
        Ft ft = C0604fF.f8695j;
        Object[] objArr = new Object[4];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            c0997oh.getClass();
            if (i5 > 0) {
                return AbstractC1137rt.q(i6, objArr);
            }
            int i7 = i4;
            C0997oh c0997oh2 = c0997oh;
            C0434bF c0434bF = new C0434bF(i7, c0997oh2, i5, (ZE) this.f7563p, iArr[i5], (String) this.f7564q);
            int i8 = i6 + 1;
            int length = objArr.length;
            if (length < i8) {
                objArr = Arrays.copyOf(objArr, AbstractC0880lt.d(length, i8));
            }
            objArr[i6] = c0434bF;
            i5++;
            i6 = i8;
            i4 = i7;
            c0997oh = c0997oh2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1577u
    public u0.g q(InterfaceC1550n interfaceC1550n) {
        u0.g k3 = ((u0.g) this.f7563p).k();
        k3.H((String) this.f7564q, interfaceC1550n);
        return k3;
    }
}
