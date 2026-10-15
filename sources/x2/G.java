package x2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class G {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f15368b = new AtomicReference();
    public static final AtomicReference c = new AtomicReference();
    public static final AtomicReference d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final U f15369a;

    public G(U u2) {
        this.f15369a = u2;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        h2.y.i(atomicReference);
        h2.y.b(strArr.length == strArr2.length);
        for (int i4 = 0; i4 < strArr.length; i4++) {
            Object obj = strArr[i4];
            if (str == obj || str.equals(obj)) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i4];
                        if (str2 == null) {
                            str2 = strArr2[i4] + "(" + strArr[i4] + ")";
                            strArr3[i4] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String b4 = obj instanceof Bundle ? b((Bundle) obj) : String.valueOf(obj);
            if (b4 != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(b4);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final String b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f15369a.b()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(e(str));
            sb.append("=");
            Object obj = bundle.get(str);
            sb.append(obj instanceof Bundle ? a(new Object[]{obj}) : obj instanceof Object[] ? a((Object[]) obj) : obj instanceof ArrayList ? a(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb.append("}]");
        return sb.toString();
    }

    public final String c(C2096s c2096s) {
        U u2 = this.f15369a;
        if (!u2.b()) {
            return c2096s.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(c2096s.f15783q);
        sb.append(",name=");
        sb.append(d(c2096s.f15781o));
        sb.append(",params=");
        r rVar = c2096s.f15782p;
        sb.append(rVar == null ? null : !u2.b() ? rVar.f15773o.toString() : b(rVar.h()));
        return sb.toString();
    }

    public final String d(String str) {
        if (str == null) {
            return null;
        }
        return !this.f15369a.b() ? str : g(str, AbstractC2080j0.c, AbstractC2080j0.f15679a, f15368b);
    }

    public final String e(String str) {
        if (str == null) {
            return null;
        }
        return !this.f15369a.b() ? str : g(str, AbstractC2080j0.f15682f, AbstractC2080j0.f15681e, c);
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f15369a.b() ? str : str.startsWith("_exp_") ? U.a.k("experiment_id(", str, ")") : g(str, AbstractC2080j0.f15686j, AbstractC2080j0.f15685i, d);
    }
}
