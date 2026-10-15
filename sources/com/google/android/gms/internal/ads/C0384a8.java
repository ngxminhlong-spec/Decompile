package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.a8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0384a8 implements As {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8084b;

    public /* synthetic */ C0384a8(String str, int i4) {
        this.f8083a = i4;
        this.f8084b = str;
    }

    @Override // com.google.android.gms.internal.ads.As
    public final Object apply(Object obj) {
        int i4 = this.f8083a;
        String str = this.f8084b;
        switch (i4) {
            case 0:
                String str2 = (String) obj;
                C0427b8 c0427b8 = AbstractC0554e8.f8561a;
                if (str2 == null) {
                    return str;
                }
                if (((Boolean) M6.f6215f.r()).booleanValue()) {
                    String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                    String host = Uri.parse(str).getHost();
                    for (int i5 = 0; i5 < 3; i5++) {
                        if (!host.endsWith(strArr[i5])) {
                        }
                    }
                    return str;
                }
                String str3 = (String) M6.f6212a.r();
                String str4 = (String) M6.f6213b.r();
                if (!TextUtils.isEmpty(str3)) {
                    str = str.replace(str3, str2);
                }
                if (TextUtils.isEmpty(str4)) {
                    return str;
                }
                Uri parse = Uri.parse(str);
                return TextUtils.isEmpty(parse.getQueryParameter(str4)) ? parse.buildUpon().appendQueryParameter(str4, str2).toString() : str;
            case 1:
                Throwable th = (Throwable) obj;
                C0427b8 c0427b82 = AbstractC0554e8.f8561a;
                if (((Boolean) M6.f6218i.r()).booleanValue()) {
                    N1.n.f1204A.f1209g.h("prepareClickUrl.attestation2", th);
                }
                return str;
            case 2:
                return new C0742ij(str, (BinderC0682h7) obj);
            default:
                Y9.p("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
        }
    }
}
