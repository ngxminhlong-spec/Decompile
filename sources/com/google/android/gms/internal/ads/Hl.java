package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Hl implements InterfaceC0749iq {

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f5504r = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);

    /* renamed from: o, reason: collision with root package name */
    public final String f5505o;

    /* renamed from: p, reason: collision with root package name */
    public final Aq f5506p;

    /* renamed from: q, reason: collision with root package name */
    public final Eq f5507q;

    public Hl(String str, Eq eq, Aq aq) {
        this.f5505o = str;
        this.f5507q = eq;
        this.f5506p = aq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0749iq
    public final Object l(Object obj) {
        Xk xk;
        String str;
        Gl gl = (Gl) obj;
        int optInt = gl.f5329a.optInt("http_timeout_millis", 60000);
        C0393ab c0393ab = gl.f5330b;
        int i4 = c0393ab.f8119g;
        String str2 = c0393ab.c;
        Aq aq = this.f5506p;
        Eq eq = this.f5507q;
        String str3 = "";
        int i5 = 1;
        if (i4 != -2) {
            if (i4 == 1) {
                List list = c0393ab.f8115a;
                if (list != null) {
                    str3 = TextUtils.join(", ", list);
                    Y9.p(str3);
                }
                xk = new Xk("Error building request URL: ".concat(String.valueOf(str3)), 2);
            } else {
                xk = new Xk(1);
            }
            aq.d(xk);
            aq.b(false);
            eq.a(aq);
            throw xk;
        }
        HashMap hashMap = new HashMap();
        if (c0393ab.f8117e) {
            String str4 = this.f5505o;
            if (!TextUtils.isEmpty(str4)) {
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10098E0)).booleanValue()) {
                    if (TextUtils.isEmpty(str4)) {
                        str = "";
                    } else {
                        Matcher matcher = f5504r.matcher(str4);
                        str = "";
                        while (matcher.find()) {
                            String group = matcher.group(i5);
                            if (group != null) {
                                Locale locale = Locale.ROOT;
                                if (group.toLowerCase(locale).startsWith("id=") || group.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(str)) {
                                        str = str.concat("; ");
                                    }
                                    str = str.concat(group);
                                }
                            }
                            i5 = 1;
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put("Cookie", str);
                    }
                } else {
                    hashMap.put("Cookie", str4);
                }
            }
        }
        if (c0393ab.d) {
            Xj.k(hashMap, gl.f5329a);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        aq.b(true);
        eq.a(aq);
        return new El(c0393ab.f8118f, optInt, hashMap, str2.getBytes(AbstractC1480zs.c), "", c0393ab.d);
    }
}
