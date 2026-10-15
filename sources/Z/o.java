package Z;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final t.k f2290a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f2291b = new Object();
    public static C2033d c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? m.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static C2033d b() {
        C2033d c2033d = new C2033d(16);
        c = c2033d;
        f2290a.j(c2033d);
        return c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:14|(1:80)(1:18)|19|(1:79)(1:23)|24|25|26|(2:64|65)(1:28)|29|(9:36|(1:40)|(1:47)|48|(2:56|57)|52|53|54|55)|(1:63)|(1:40)|(3:42|45|47)|48|(1:50)|56|57|52|53|54|55) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009e, code lost:
    
        r6 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.o.c(android.content.Context, boolean):void");
    }
}
