package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.h8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0683h8 implements InterfaceC0597f8 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8928o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f8929p;

    public /* synthetic */ C0683h8(Context context, int i4) {
        this.f8928o = i4;
        this.f8929p = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0597f8
    public final void h(Object obj, Map map) {
        switch (this.f8928o) {
            case 0:
                N1.n nVar = N1.n.f1204A;
                C0356Wb c0356Wb = nVar.f1225w;
                C0356Wb c0356Wb2 = nVar.f1225w;
                Context context = this.f8929p;
                if (c0356Wb.j(context)) {
                    String str = (String) map.get("eventName");
                    String str2 = (String) map.get("eventId");
                    int hashCode = str.hashCode();
                    if (hashCode != 94399) {
                        if (hashCode != 94401) {
                            if (hashCode == 94407 && str.equals("_ai")) {
                                c0356Wb2.b(context, "_ai", str2, null);
                                return;
                            }
                        } else if (str.equals("_ac")) {
                            c0356Wb2.b(context, "_ac", str2, null);
                            return;
                        }
                    } else if (str.equals("_aa")) {
                        c0356Wb2.b(context, "_aa", str2, null);
                        return;
                    }
                    Y9.p("logScionEvent gmsg contained unsupported eventName");
                    return;
                }
                return;
            default:
                if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
                    return;
                }
                Q1.I.w("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
                if (map.containsKey("title")) {
                    intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
                }
                try {
                    Q1.N n4 = N1.n.f1204A.c;
                    Q1.N.o(this.f8929p, intent);
                    return;
                } catch (RuntimeException e4) {
                    Y9.t("Failed to open Share Sheet", e4);
                    N1.n.f1204A.f1209g.h("ShareSheetGmsgHandler.onGmsg", e4);
                    return;
                }
        }
    }
}
