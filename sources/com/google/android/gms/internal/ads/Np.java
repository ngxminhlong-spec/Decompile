package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Np {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f6394a;

    public Np() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) O1.r.d.c.a(AbstractC1066q6.b6));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.f6394a = pattern;
    }

    public final String a(String str) {
        Pattern pattern = this.f6394a;
        if (pattern == null || str == null) {
            return null;
        }
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }
}
