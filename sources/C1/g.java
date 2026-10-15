package C1;

import Q1.z;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.internal.ads.C0326Qb;
import com.google.android.gms.internal.ads.C0470c9;
import com.google.android.gms.internal.ads.QC;
import com.google.firebase.storage.StorageRegistrar;
import i1.InterfaceC1715a;
import j3.C1734a;
import j3.C1735b;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import k.o;
import m2.AbstractC1806a;
import n3.InterfaceC1817d;
import n3.q;
import o2.AbstractC1895f;
import s3.C1984d;
import s3.C1985e;
import u1.C2014b;
import v1.m;
import v3.C2032c;
import v3.C2033d;
import w1.C2046i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements E1.b, InterfaceC1715a, InterfaceC1817d, A2.a {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f484o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f485p;

    public /* synthetic */ g(int i4, Object obj) {
        this.f484o = i4;
        this.f485p = obj;
    }

    @Override // E1.b
    public Object a() {
        SQLiteDatabase a4;
        int i4 = this.f484o;
        int i5 = 3;
        boolean z4 = false;
        Object obj = this.f485p;
        switch (i4) {
            case 0:
                D1.h hVar = (D1.h) ((D1.c) obj);
                hVar.getClass();
                int i6 = z1.a.f15946e;
                u0.g gVar = new u0.g(23, z4);
                gVar.f14983p = null;
                gVar.f14984q = new ArrayList();
                gVar.f14985r = null;
                gVar.f14986s = "";
                HashMap hashMap = new HashMap();
                a4 = hVar.a();
                a4.beginTransaction();
                try {
                    z1.a aVar = (z1.a) D1.h.i(a4.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new B1.b(hVar, hashMap, gVar, i5));
                    a4.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 1:
                D1.h hVar2 = (D1.h) ((D1.d) obj);
                Integer num = (Integer) hVar2.d(new D1.e(hVar2, hVar2.f657p.c() - hVar2.f659r.d));
                num.getClass();
                return num;
            case 2:
                D1.h hVar3 = (D1.h) ((D1.c) ((l) obj).f506i);
                a4 = hVar3.a();
                a4.beginTransaction();
                try {
                    a4.compileStatement("DELETE FROM log_event_dropped").execute();
                    a4.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.f657p.c()).execute();
                    a4.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                u0.g gVar2 = (u0.g) obj;
                a4 = ((D1.h) ((D1.d) gVar2.f14984q)).a();
                a4.beginTransaction();
                try {
                    Cursor rawQuery = a4.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                    try {
                        ArrayList arrayList = new ArrayList();
                        while (rawQuery.moveToNext()) {
                            t3.g a5 = C2046i.a();
                            a5.h(rawQuery.getString(1));
                            a5.f14963q = G1.a.b(rawQuery.getInt(2));
                            String string = rawQuery.getString(3);
                            a5.f14962p = string == null ? null : Base64.decode(string, 0);
                            arrayList.add(a5.a());
                        }
                        rawQuery.close();
                        a4.setTransactionSuccessful();
                        a4.endTransaction();
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj2 = arrayList.get(i7);
                            i7++;
                            ((q2.e) gVar2.f14985r).z((C2046i) obj2, 1, false);
                        }
                        return null;
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                } finally {
                }
        }
    }

    public QC b(t3.g gVar) {
        C2014b c2014b = (C2014b) this.f485p;
        URL url = (URL) gVar.f14961o;
        String s4 = AbstractC1806a.s("CctTransportBackend");
        if (Log.isLoggable(s4, 4)) {
            Log.i(s4, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(c2014b.f14994g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.8 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) gVar.f14963q;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    o oVar = c2014b.f14990a;
                    v1.i iVar = (v1.i) gVar.f14962p;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    C1984d c1984d = (C1984d) oVar.f13452p;
                    C1985e c1985e = new C1985e(bufferedWriter, c1984d.f14807a, c1984d.f14808b, c1984d.c, c1984d.d);
                    c1985e.e(iVar);
                    c1985e.g();
                    c1985e.f14810b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String s5 = AbstractC1806a.s("CctTransportBackend");
                    if (Log.isLoggable(s5, 4)) {
                        Log.i(s5, String.format("Status Code: %d", valueOf));
                    }
                    AbstractC1806a.i(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    AbstractC1806a.i(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new QC(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new QC(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            QC qc = new QC(responseCode, null, m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f15077a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return qc;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (ConnectException e4) {
            e = e4;
            AbstractC1806a.k("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new QC(500, null, 0L);
        } catch (UnknownHostException e5) {
            e = e5;
            AbstractC1806a.k("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new QC(500, null, 0L);
        } catch (IOException e6) {
            e = e6;
            AbstractC1806a.k("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new QC(400, null, 0L);
        } catch (q3.b e7) {
            e = e7;
            AbstractC1806a.k("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new QC(400, null, 0L);
        }
    }

    @Override // n3.InterfaceC1817d
    public Object c(C0326Qb c0326Qb) {
        switch (this.f484o) {
            case 5:
                return StorageRegistrar.a((StorageRegistrar) this.f485p, c0326Qb);
            case 6:
            default:
                return new C2032c((Context) c0326Qb.a(Context.class), ((d3.g) c0326Qb.a(d3.g.class)).c(), c0326Qb.x(C2033d.class), c0326Qb.e(D3.c.class), (Executor) c0326Qb.d((q) this.f485p));
            case 7:
                return this.f485p;
        }
    }

    @Override // A2.a
    public Object e(A2.h hVar) {
        C1735b c1735b = (C1735b) this.f485p;
        z zVar = c1735b.f13341j;
        if (zVar != null) {
            long j4 = zVar.f1736o + zVar.f1737p;
            c1735b.f13340i.getClass();
            if (j4 - System.currentTimeMillis() > 300000) {
                return AbstractC1895f.l(C1734a.a(c1735b.f13341j));
            }
        }
        return AbstractC1895f.l(new C1734a("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", new C0470c9("No AppCheckProvider installed.")));
    }

    @Override // i1.InterfaceC1715a
    public void k(Throwable th) {
        ((D0.g) this.f485p).l0(R.string.save_success);
    }
}
