package e2;

import h2.y;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import l2.AbstractC1799b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f12765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12766b;
    public final /* synthetic */ p c;

    public /* synthetic */ m(boolean z4, String str, p pVar) {
        this.f12765a = z4;
        this.f12766b = str;
        this.c = pVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        int i4 = 0;
        boolean z4 = this.f12765a;
        String str = this.f12766b;
        p pVar = this.c;
        String str2 = (z4 || !r.b(str, pVar, true, false).f12781a) ? "not allowed" : "debug cert rejected";
        while (true) {
            if (i4 >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                break;
            }
            i4++;
        }
        y.i(messageDigest);
        return str2 + ": pkg=" + str + ", sha256=" + AbstractC1799b.b(messageDigest.digest(pVar.f12771q)) + ", atk=" + z4 + ", ver=12451000.false";
    }
}
