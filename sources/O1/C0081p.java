package O1;

import com.google.android.gms.internal.ads.C0248Bc;
import com.google.android.gms.internal.ads.C1335wc;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: O1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0081p {

    /* renamed from: f, reason: collision with root package name */
    public static final C0081p f1374f = new C0081p();

    /* renamed from: a, reason: collision with root package name */
    public final C1335wc f1375a;

    /* renamed from: b, reason: collision with root package name */
    public final C0077n f1376b;
    public final String c;
    public final C0248Bc d;

    /* renamed from: e, reason: collision with root package name */
    public final Random f1377e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.gms.internal.ads.wc] */
    public C0081p() {
        ?? obj = new Object();
        obj.f11178a = -1.0f;
        C0077n c0077n = new C0077n(new H0("com.google.android.gms.ads.AdManagerCreatorImpl", 2), new H0("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl", 1), new H0("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl", 0), new H0("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl", 3), new H0("com.google.android.gms.ads.AdOverlayCreatorImpl", 4));
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i4 = 0; i4 < 2; i4++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        C0248Bc c0248Bc = new C0248Bc(0, 234310000, true, false);
        Random random = new Random();
        this.f1375a = obj;
        this.f1376b = c0077n;
        this.c = bigInteger;
        this.d = c0248Bc;
        this.f1377e = random;
    }
}
