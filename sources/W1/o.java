package W1;

import O1.r;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import c3.InterfaceFutureC0239a;
import com.google.android.gms.internal.ads.AbstractC0751is;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.Aq;
import com.google.android.gms.internal.ads.C0572ek;
import com.google.android.gms.internal.ads.C0590f1;
import com.google.android.gms.internal.ads.C0820kc;
import com.google.android.gms.internal.ads.C0828kk;
import com.google.android.gms.internal.ads.C0860lF;
import com.google.android.gms.internal.ads.C0937n6;
import com.google.android.gms.internal.ads.C1058pz;
import com.google.android.gms.internal.ads.C1134rq;
import com.google.android.gms.internal.ads.Eq;
import com.google.android.gms.internal.ads.G6;
import com.google.android.gms.internal.ads.InterfaceC0522dc;
import com.google.android.gms.internal.ads.Mu;
import com.google.android.gms.internal.ads.PB;
import com.google.android.gms.internal.ads.QC;
import com.google.android.gms.internal.ads.RB;
import com.google.android.gms.internal.ads.U;
import com.google.android.gms.internal.ads.Wl;
import com.google.android.gms.internal.ads.Y9;
import java.nio.ByteBuffer;
import java.util.Arrays;
import o2.AbstractC1895f;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class o implements Mu {

    /* renamed from: o, reason: collision with root package name */
    public long f2013o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f2014p;

    /* renamed from: q, reason: collision with root package name */
    public Object f2015q;

    /* renamed from: r, reason: collision with root package name */
    public Object f2016r;

    /* renamed from: s, reason: collision with root package name */
    public Object f2017s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f2018t;

    public o(b bVar, InterfaceFutureC0239a interfaceFutureC0239a, C0820kc c0820kc, InterfaceC0522dc interfaceC0522dc, Aq aq, long j4) {
        this.f2018t = bVar;
        this.f2014p = interfaceFutureC0239a;
        this.f2015q = c0820kc;
        this.f2016r = interfaceC0522dc;
        this.f2017s = aq;
        this.f2013o = j4;
    }

    public o(C1058pz c1058pz) {
        this.f2018t = c1058pz;
        this.f2014p = new C1134rq(32);
        C0590f1 c0590f1 = new C0590f1(0L);
        this.f2015q = c0590f1;
        this.f2016r = c0590f1;
        this.f2017s = c0590f1;
    }

    public static C0590f1 c(C0590f1 c0590f1, long j4, ByteBuffer byteBuffer, int i4) {
        while (j4 >= c0590f1.f8670p) {
            c0590f1 = (C0590f1) c0590f1.f8672r;
        }
        while (i4 > 0) {
            int min = Math.min(i4, (int) (c0590f1.f8670p - j4));
            C0860lF c0860lF = (C0860lF) c0590f1.f8671q;
            byte[] bArr = c0860lF.f9431a;
            long j5 = j4 - c0590f1.f8669o;
            c0860lF.getClass();
            byteBuffer.put(bArr, (int) j5, min);
            i4 -= min;
            j4 += min;
            if (j4 == c0590f1.f8670p) {
                c0590f1 = (C0590f1) c0590f1.f8672r;
            }
        }
        return c0590f1;
    }

    public static C0590f1 d(C0590f1 c0590f1, long j4, byte[] bArr, int i4) {
        while (j4 >= c0590f1.f8670p) {
            c0590f1 = (C0590f1) c0590f1.f8672r;
        }
        int i5 = i4;
        while (i5 > 0) {
            int min = Math.min(i5, (int) (c0590f1.f8670p - j4));
            C0860lF c0860lF = (C0860lF) c0590f1.f8671q;
            byte[] bArr2 = c0860lF.f9431a;
            long j5 = j4 - c0590f1.f8669o;
            c0860lF.getClass();
            System.arraycopy(bArr2, (int) j5, bArr, i4 - i5, min);
            i5 -= min;
            j4 += min;
            if (j4 == c0590f1.f8670p) {
                c0590f1 = (C0590f1) c0590f1.f8672r;
            }
        }
        return c0590f1;
    }

    public static C0590f1 e(C0590f1 c0590f1, RB rb, QC qc, C1134rq c1134rq) {
        if (rb.a(1073741824)) {
            long j4 = qc.f6651p;
            int i4 = 1;
            c1134rq.b(1);
            C0590f1 d = d(c0590f1, j4, c1134rq.f10536a, 1);
            long j5 = j4 + 1;
            byte b4 = c1134rq.f10536a[0];
            int i5 = b4 & 128;
            int i6 = b4 & Byte.MAX_VALUE;
            PB pb = rb.d;
            byte[] bArr = pb.f6572a;
            if (bArr == null) {
                pb.f6572a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z4 = i5 != 0;
            c0590f1 = d(d, j5, pb.f6572a, i6);
            long j6 = j5 + i6;
            if (z4) {
                c1134rq.b(2);
                c0590f1 = d(c0590f1, j6, c1134rq.f10536a, 2);
                j6 += 2;
                i4 = c1134rq.q();
            }
            int[] iArr = pb.d;
            if (iArr == null || iArr.length < i4) {
                iArr = new int[i4];
            }
            int[] iArr2 = pb.f6574e;
            if (iArr2 == null || iArr2.length < i4) {
                iArr2 = new int[i4];
            }
            if (z4) {
                int i7 = i4 * 6;
                c1134rq.b(i7);
                c0590f1 = d(c0590f1, j6, c1134rq.f10536a, i7);
                j6 += i7;
                c1134rq.e(0);
                for (int i8 = 0; i8 < i4; i8++) {
                    iArr[i8] = c1134rq.q();
                    iArr2[i8] = c1134rq.p();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = qc.f6650o - ((int) (j6 - qc.f6651p));
            }
            U u2 = (U) qc.f6652q;
            int i9 = AbstractC0751is.f9071a;
            byte[] bArr2 = u2.f7103b;
            byte[] bArr3 = pb.f6572a;
            int i10 = u2.f7102a;
            int i11 = u2.c;
            int i12 = u2.d;
            pb.f6575f = i4;
            pb.d = iArr;
            pb.f6574e = iArr2;
            pb.f6573b = bArr2;
            pb.f6572a = bArr3;
            pb.c = i10;
            pb.f6576g = i11;
            pb.f6577h = i12;
            MediaCodec.CryptoInfo cryptoInfo = pb.f6578i;
            cryptoInfo.numSubSamples = i4;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i10;
            if (AbstractC0751is.f9071a >= 24) {
                Wl wl = pb.f6579j;
                wl.getClass();
                ((MediaCodec.CryptoInfo.Pattern) wl.f7564q).set(i11, i12);
                ((MediaCodec.CryptoInfo) wl.f7563p).setPattern((MediaCodec.CryptoInfo.Pattern) wl.f7564q);
            }
            long j7 = qc.f6651p;
            int i13 = (int) (j6 - j7);
            qc.f6651p = j7 + i13;
            qc.f6650o -= i13;
        }
        if (!rb.a(268435456)) {
            rb.e(qc.f6650o);
            return c(c0590f1, qc.f6651p, rb.f6791e, qc.f6650o);
        }
        c1134rq.b(4);
        C0590f1 d4 = d(c0590f1, qc.f6651p, c1134rq.f10536a, 4);
        int p3 = c1134rq.p();
        qc.f6651p += 4;
        qc.f6650o -= 4;
        rb.e(p3);
        C0590f1 c = c(d4, qc.f6651p, rb.f6791e, p3);
        qc.f6651p += p3;
        int i14 = qc.f6650o - p3;
        qc.f6650o = i14;
        ByteBuffer byteBuffer = rb.f6794h;
        if (byteBuffer == null || byteBuffer.capacity() < i14) {
            rb.f6794h = ByteBuffer.allocate(i14);
        } else {
            rb.f6794h.clear();
        }
        return c(c, qc.f6651p, rb.f6794h, qc.f6650o);
    }

    public void a(long j4) {
        C0590f1 c0590f1;
        if (j4 != -1) {
            while (true) {
                c0590f1 = (C0590f1) this.f2015q;
                if (j4 < c0590f1.f8670p) {
                    break;
                }
                C1058pz c1058pz = (C1058pz) this.f2018t;
                C0860lF c0860lF = (C0860lF) c0590f1.f8671q;
                synchronized (c1058pz) {
                    C0860lF[] c0860lFArr = (C0860lF[]) c1058pz.d;
                    int i4 = c1058pz.c;
                    c1058pz.c = i4 + 1;
                    c0860lFArr[i4] = c0860lF;
                    c1058pz.f10061b--;
                    c1058pz.notifyAll();
                }
                C0590f1 c0590f12 = (C0590f1) this.f2015q;
                c0590f12.f8671q = null;
                C0590f1 c0590f13 = (C0590f1) c0590f12.f8672r;
                c0590f12.f8672r = null;
                this.f2015q = c0590f13;
            }
            if (((C0590f1) this.f2016r).f8669o < c0590f1.f8669o) {
                this.f2016r = c0590f1;
            }
        }
    }

    public int b(int i4) {
        C0860lF c0860lF;
        C0590f1 c0590f1 = (C0590f1) this.f2017s;
        if (((C0860lF) c0590f1.f8671q) == null) {
            C1058pz c1058pz = (C1058pz) this.f2018t;
            synchronized (c1058pz) {
                try {
                    int i5 = c1058pz.f10061b + 1;
                    c1058pz.f10061b = i5;
                    int i6 = c1058pz.c;
                    if (i6 > 0) {
                        C0860lF[] c0860lFArr = (C0860lF[]) c1058pz.d;
                        int i7 = i6 - 1;
                        c1058pz.c = i7;
                        c0860lF = c0860lFArr[i7];
                        if (c0860lF == null) {
                            throw null;
                        }
                        c0860lFArr[i7] = null;
                    } else {
                        c0860lF = new C0860lF(new byte[65536]);
                        C0860lF[] c0860lFArr2 = (C0860lF[]) c1058pz.d;
                        int length = c0860lFArr2.length;
                        if (i5 > length) {
                            c1058pz.d = (C0860lF[]) Arrays.copyOf(c0860lFArr2, length + length);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C0590f1 c0590f12 = new C0590f1(((C0590f1) this.f2017s).f8670p);
            c0590f1.f8671q = c0860lF;
            c0590f1.f8672r = c0590f12;
        }
        return Math.min(i4, (int) (((C0590f1) this.f2017s).f8670p - this.f2013o));
    }

    @Override // com.google.android.gms.internal.ads.Mu
    /* renamed from: r */
    public void mo4r(Object obj) {
        String str;
        String str2;
        boolean booleanValue;
        InterfaceC0522dc interfaceC0522dc = (InterfaceC0522dc) this.f2016r;
        Aq aq = (Aq) this.f2017s;
        f fVar = (f) obj;
        Eq U32 = b.U3((InterfaceFutureC0239a) this.f2014p, (C0820kc) this.f2015q);
        b bVar = (b) this.f2018t;
        String str3 = bVar.f1960H;
        String str4 = bVar.f1961I;
        C0828kk c0828kk = bVar.f1954B;
        bVar.f1970S.set(true);
        C0937n6 c0937n6 = AbstractC1066q6.L6;
        r rVar = r.d;
        if (!((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            try {
                interfaceC0522dc.B("QueryInfo generation has been disabled.");
            } catch (RemoteException e4) {
                Y9.p("QueryInfo generation has been disabled.".concat(e4.toString()));
            }
            if (!((Boolean) G6.f5135e.r()).booleanValue() || U32 == null) {
                return;
            }
            aq.y("QueryInfo generation has been disabled.");
            aq.b(false);
            U32.a(aq);
            U32.g();
            return;
        }
        N1.n nVar = N1.n.f1204A;
        nVar.f1212j.getClass();
        long currentTimeMillis = System.currentTimeMillis() - this.f2013o;
        try {
            if (fVar == null) {
                try {
                    interfaceC0522dc.L1(null, null, null);
                    AbstractC1895f.I(c0828kk, bVar.f1976t, "sgs", new Pair("rid", "-1"));
                    aq.b(true);
                    if (!booleanValue || U32 == null) {
                        return;
                    } else {
                        return;
                    }
                } catch (RemoteException e5) {
                    e = e5;
                    str2 = "SignalGeneratorImpl.generateSignals.onSuccess";
                }
            } else {
                try {
                    str = "SignalGeneratorImpl.generateSignals.onSuccess";
                    try {
                        try {
                            JSONObject jSONObject = new JSONObject(fVar.f1994b);
                            String optString = jSONObject.optString("request_id", "");
                            if (TextUtils.isEmpty(optString)) {
                                Y9.s("The request ID is empty in request JSON.");
                                interfaceC0522dc.B("Internal error: request ID is empty in request JSON.");
                                AbstractC1895f.I(c0828kk, bVar.f1976t, "sgf", new Pair("sgf_reason", "rid_missing"));
                                aq.y("Request ID empty");
                                aq.b(false);
                                if (!((Boolean) G6.f5135e.r()).booleanValue() || U32 == null) {
                                    return;
                                }
                                U32.a(aq);
                                U32.g();
                                return;
                            }
                            b.K3(bVar, optString, fVar.f1994b, bVar.f1976t);
                            Bundle bundle = fVar.c;
                            if (bVar.f1959G && bundle != null && bundle.getInt(str4, -1) == -1) {
                                bundle.putInt(str4, bVar.f1962J.get());
                            }
                            if (bVar.f1958F && bundle != null && TextUtils.isEmpty(bundle.getString(str3))) {
                                if (TextUtils.isEmpty(bVar.f1964L)) {
                                    bVar.f1964L = nVar.c.u(bVar.f1973q, bVar.f1963K.f4084o);
                                }
                                bundle.putString(str3, bVar.f1964L);
                            }
                            interfaceC0522dc.L1(fVar.f1993a, fVar.f1994b, bundle);
                            C0572ek c0572ek = bVar.f1976t;
                            Pair pair = new Pair("tqgt", String.valueOf(currentTimeMillis));
                            String str5 = "na";
                            if (((Boolean) rVar.c.a(AbstractC1066q6.w8)).booleanValue()) {
                                try {
                                    str5 = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                                } catch (JSONException e6) {
                                    Y9.q("Error retrieving JSONObject from the requestJson, ", e6);
                                }
                            }
                            AbstractC1895f.I(c0828kk, c0572ek, "sgs", pair, new Pair("tpc", str5));
                            aq.b(true);
                            if (!((Boolean) G6.f5135e.r()).booleanValue() || U32 == null) {
                                return;
                            }
                            U32.a(aq);
                            U32.g();
                            return;
                        } catch (JSONException e7) {
                            e = e7;
                            Y9.s("Failed to create JSON object from the request string.");
                            interfaceC0522dc.B("Internal error for request JSON: " + e.toString());
                            AbstractC1895f.I(c0828kk, bVar.f1976t, "sgf", new Pair("sgf_reason", "request_invalid"));
                            aq.d(e);
                            aq.b(false);
                            str2 = str;
                            try {
                                N1.n.f1204A.f1209g.h(str2, e);
                                if (!((Boolean) G6.f5135e.r()).booleanValue() || U32 == null) {
                                    return;
                                }
                                U32.a(aq);
                                U32.g();
                                return;
                            } catch (RemoteException e8) {
                                e = e8;
                            }
                        }
                    } catch (RemoteException e9) {
                        e = e9;
                        str2 = str;
                        aq.d(e);
                        aq.b(false);
                        Y9.q("", e);
                        N1.n.f1204A.f1209g.h(str2, e);
                        if (((Boolean) G6.f5135e.r()).booleanValue()) {
                            return;
                        } else {
                            return;
                        }
                    }
                } catch (RemoteException e10) {
                    e = e10;
                    str = "SignalGeneratorImpl.generateSignals.onSuccess";
                } catch (JSONException e11) {
                    e = e11;
                    str = "SignalGeneratorImpl.generateSignals.onSuccess";
                }
            }
            aq.d(e);
            aq.b(false);
            Y9.q("", e);
            N1.n.f1204A.f1209g.h(str2, e);
            if (((Boolean) G6.f5135e.r()).booleanValue() || U32 == null) {
                return;
            }
            U32.a(aq);
            U32.g();
        } finally {
            if (((Boolean) G6.f5135e.r()).booleanValue() && U32 != null) {
                U32.a(aq);
                U32.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public void y(Throwable th) {
        N1.n nVar = N1.n.f1204A;
        nVar.f1212j.getClass();
        long currentTimeMillis = System.currentTimeMillis() - this.f2013o;
        String message = th.getMessage();
        nVar.f1209g.h("SignalGeneratorImpl.generateSignals", th);
        b bVar = (b) this.f2018t;
        AbstractC1895f.I(bVar.f1954B, bVar.f1976t, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(currentTimeMillis)));
        Eq U32 = b.U3((InterfaceFutureC0239a) this.f2014p, (C0820kc) this.f2015q);
        if (((Boolean) G6.f5135e.r()).booleanValue() && U32 != null) {
            Aq aq = (Aq) this.f2017s;
            aq.d(th);
            aq.b(false);
            U32.a(aq);
            U32.g();
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            ((InterfaceC0522dc) this.f2016r).B(message);
        } catch (RemoteException e4) {
            Y9.q("", e4);
        }
    }
}
