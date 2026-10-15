package u1;

import d3.AbstractC1654b;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import t1.C1991b;
import w1.InterfaceC2048k;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: u1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2013a implements InterfaceC2048k {
    public static final String c;
    public static final Set d;

    /* renamed from: e, reason: collision with root package name */
    public static final C2013a f14987e;

    /* renamed from: a, reason: collision with root package name */
    public final String f14988a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14989b;

    static {
        String F2 = AbstractC1654b.F("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = F2;
        AbstractC1654b.F("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        AbstractC1654b.F("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C1991b("proto"), new C1991b("json"))));
        f14987e = new C2013a(F2, null);
    }

    public C2013a(String str, String str2) {
        this.f14988a = str;
        this.f14989b = str2;
    }

    public static C2013a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C2013a(str2, str3);
    }
}
