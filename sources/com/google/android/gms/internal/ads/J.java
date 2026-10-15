package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class J {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f5773a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f5774b = -1;

    public final void a(C1120rc c1120rc) {
        int i4 = 0;
        while (true) {
            InterfaceC0479cc[] interfaceC0479ccArr = c1120rc.f10477o;
            if (i4 >= interfaceC0479ccArr.length) {
                return;
            }
            InterfaceC0479cc interfaceC0479cc = interfaceC0479ccArr[i4];
            if (interfaceC0479cc instanceof C0) {
                C0 c02 = (C0) interfaceC0479cc;
                if ("iTunSMPB".equals(c02.f4213q) && b(c02.f4214r)) {
                    return;
                }
            } else if (interfaceC0479cc instanceof G0) {
                G0 g02 = (G0) interfaceC0479cc;
                if ("com.apple.iTunes".equals(g02.f5108p) && "iTunSMPB".equals(g02.f5109q) && b(g02.f5110r)) {
                    return;
                }
            } else {
                continue;
            }
            i4++;
        }
    }

    public final boolean b(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i4 = AbstractC0751is.f9071a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f5773a = parseInt;
            this.f5774b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
