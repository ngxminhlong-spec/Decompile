package B0;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import com.google.android.gms.internal.ads.AbstractC0751is;
import com.google.android.gms.internal.ads.AbstractC0880lt;
import com.google.android.gms.internal.ads.AbstractC1137rt;
import com.google.android.gms.internal.ads.C0507d3;
import com.google.android.gms.internal.ads.C0604fF;
import com.google.android.gms.internal.ads.C0644gC;
import com.google.android.gms.internal.ads.C0976o2;
import com.google.android.gms.internal.ads.C0997oh;
import com.google.android.gms.internal.ads.C1190t2;
import com.google.android.gms.internal.ads.C1475zn;
import com.google.android.gms.internal.ads.F2;
import com.google.android.gms.internal.ads.Gt;
import com.google.android.gms.internal.ads.InterfaceC0476cF;
import com.google.android.gms.internal.ads.Jn;
import com.google.android.gms.internal.ads.RunnableC0744il;
import com.google.android.gms.internal.ads.VE;
import com.google.android.gms.internal.ads.WE;
import com.google.android.gms.internal.ads.Z2;
import com.google.android.gms.internal.ads.ZE;
import h2.y;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.concurrent.Executor;
import x2.T;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c implements InterfaceC0476cF {

    /* renamed from: s, reason: collision with root package name */
    public static volatile int f66s = 1;

    /* renamed from: o, reason: collision with root package name */
    public boolean f67o;

    /* renamed from: p, reason: collision with root package name */
    public Object f68p;

    /* renamed from: q, reason: collision with root package name */
    public Object f69q;

    /* renamed from: r, reason: collision with root package name */
    public Object f70r;

    public /* synthetic */ c(Context context, Object obj, Object obj2, boolean z4) {
        this.f68p = context;
        this.f69q = obj;
        this.f70r = obj2;
        this.f67o = z4;
    }

    public c(F2 f22) {
        this.f67o = false;
        this.f68p = null;
        this.f69q = null;
        this.f70r = f22;
    }

    public c(Object obj, C1190t2 c1190t2) {
        this.f67o = false;
        this.f68p = obj;
        this.f69q = c1190t2;
        this.f70r = null;
    }

    public c(T t4, String str) {
        this.f70r = t4;
        y.e(str);
        this.f68p = str;
    }

    public static c a(Context context, Executor executor, boolean z4) {
        A2.i iVar = new A2.i();
        if (z4) {
            executor.execute(new Jn(10, context, iVar));
        } else {
            executor.execute(new RunnableC0744il(15, iVar));
        }
        return new c(context, executor, iVar.f26a, z4);
    }

    public String b() {
        if (!this.f67o) {
            this.f67o = true;
            this.f69q = ((T) this.f70r).k().getString((String) this.f68p, null);
        }
        return (String) this.f69q;
    }

    public void c(String str) {
        SharedPreferences.Editor edit = ((T) this.f70r).k().edit();
        edit.putString((String) this.f68p, str);
        edit.apply();
        this.f69q = str;
    }

    public void d(int i4, long j4, Exception exc) {
        g(i4, j4, exc, null, null);
    }

    public void e(int i4, long j4) {
        g(i4, j4, null, null, null);
    }

    public boolean f(C0644gC c0644gC, C0976o2 c0976o2) {
        boolean canBeSpatialized;
        String str = c0976o2.f9813k;
        int i4 = c0976o2.f9826x;
        if ("audio/eac3-joc".equals(str) && i4 == 16) {
            i4 = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(AbstractC0751is.n(i4));
        int i5 = c0976o2.y;
        if (i5 != -1) {
            channelMask.setSampleRate(i5);
        }
        canBeSpatialized = ((Spatializer) this.f68p).canBeSpatialized((AudioAttributes) c0644gC.a().f7687p, channelMask.build());
        return canBeSpatialized;
    }

    public A2.h g(int i4, long j4, Exception exc, String str, String str2) {
        if (!this.f67o) {
            return ((A2.h) this.f70r).e((Executor) this.f69q, C1475zn.f11656D);
        }
        Context context = (Context) this.f68p;
        Z2 v4 = C0507d3.v();
        String packageName = context.getPackageName();
        v4.d();
        C0507d3.B((C0507d3) v4.f4561p, packageName);
        v4.d();
        C0507d3.w((C0507d3) v4.f4561p, j4);
        int i5 = f66s;
        v4.d();
        C0507d3.C((C0507d3) v4.f4561p, i5);
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            v4.d();
            C0507d3.x((C0507d3) v4.f4561p, stringWriter2);
            String name = exc.getClass().getName();
            v4.d();
            C0507d3.y((C0507d3) v4.f4561p, name);
        }
        if (str2 != null) {
            v4.d();
            C0507d3.z((C0507d3) v4.f4561p, str2);
        }
        if (str != null) {
            v4.d();
            C0507d3.A((C0507d3) v4.f4561p, str);
        }
        return ((A2.h) this.f70r).e((Executor) this.f69q, new r(i4, v4));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0476cF
    public Gt p(int i4, C0997oh c0997oh, int[] iArr) {
        VE ve = new VE((C0604fF) this.f68p);
        int i5 = ((int[]) this.f70r)[i4];
        Object[] objArr = new Object[4];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            c0997oh.getClass();
            if (i6 > 0) {
                return AbstractC1137rt.q(i7, objArr);
            }
            int i8 = i4;
            C0997oh c0997oh2 = c0997oh;
            WE we = new WE(i8, c0997oh2, i6, (ZE) this.f69q, iArr[i6], this.f67o, ve);
            int i9 = i7 + 1;
            int length = objArr.length;
            if (length < i9) {
                objArr = Arrays.copyOf(objArr, AbstractC0880lt.d(length, i9));
            }
            objArr[i7] = we;
            i6++;
            i7 = i9;
            i4 = i8;
            c0997oh = c0997oh2;
        }
    }
}
