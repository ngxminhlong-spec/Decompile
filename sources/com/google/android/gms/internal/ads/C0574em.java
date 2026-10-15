package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.JsonReader;
import android.webkit.WebView;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import n3.C1814a;
import n3.InterfaceC1817d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.em, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0574em {

    /* renamed from: a, reason: collision with root package name */
    public String f8636a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f8637b;
    public int c;
    public Serializable d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f8638e;

    /* renamed from: f, reason: collision with root package name */
    public Object f8639f;

    /* renamed from: g, reason: collision with root package name */
    public Object f8640g;

    public C0574em(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.f8638e = new HashSet();
        this.f8637b = 0;
        this.c = 0;
        this.f8640g = new HashSet();
        hashSet.add(n3.q.a(cls));
        for (Class cls2 : clsArr) {
            com.google.android.gms.internal.play_billing.B.g(cls2, "Null interface");
            ((HashSet) this.d).add(n3.q.a(cls2));
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:127:0x0184. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0023. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.em, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [t2.q, java.lang.Object] */
    public static C0574em c(JsonReader jsonReader) {
        int i4;
        ?? obj = new Object();
        obj.f8637b = 1;
        List list = Collections.EMPTY_LIST;
        obj.f8639f = list;
        obj.f8640g = list;
        obj.c = 1;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int i5 = 3;
            switch (nextName.hashCode()) {
                case -2001388947:
                    if (nextName.equals("consent_signal")) {
                        String nextString = jsonReader.nextString();
                        switch (nextString.hashCode()) {
                            case -2058725357:
                                if (!nextString.equals("CONSENT_SIGNAL_COLLECT_CONSENT")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                }
                                i5 = 5;
                                obj.f8637b = i5;
                            case -1969035850:
                                if (!nextString.equals("CONSENT_SIGNAL_ERROR")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                }
                                i5 = 7;
                                obj.f8637b = i5;
                            case -1263695752:
                                if (!nextString.equals("CONSENT_SIGNAL_UNKNOWN")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                }
                                i5 = 1;
                                obj.f8637b = i5;
                            case -954325659:
                                if (!nextString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                }
                                obj.f8637b = i5;
                            case -918677260:
                                if (!nextString.equals("CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                }
                                i5 = 8;
                                obj.f8637b = i5;
                            case 429411856:
                                if (!nextString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                }
                                i5 = 4;
                                obj.f8637b = i5;
                            case 467888915:
                                if (!nextString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                }
                                i5 = 2;
                                obj.f8637b = i5;
                            case 1725474845:
                                if (!nextString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                }
                                i5 = 6;
                                obj.f8637b = i5;
                            default:
                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                case -1938755376:
                    if (nextName.equals("error_message")) {
                        obj.f8638e = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                case -1851537225:
                    if (nextName.equals("consent_form_base_url")) {
                        obj.d = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                case -1324537865:
                    if (nextName.equals("privacy_options_required")) {
                        String nextString2 = jsonReader.nextString();
                        int hashCode = nextString2.hashCode();
                        if (hashCode == -1888946261) {
                            if (!nextString2.equals("NOT_REQUIRED")) {
                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(nextString2));
                            }
                            obj.c = i5;
                        } else {
                            if (hashCode != 389487519) {
                                if (hashCode == 433141802 && nextString2.equals("UNKNOWN")) {
                                    i5 = 1;
                                    obj.c = i5;
                                }
                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(nextString2));
                            }
                            if (!nextString2.equals("REQUIRED")) {
                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(nextString2));
                            }
                            i5 = 2;
                            obj.c = i5;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1161803523:
                    if (nextName.equals("actions")) {
                        obj.f8640g = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            ?? obj2 = new Object();
                            obj2.f14932b = 1;
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                String nextName2 = jsonReader.nextName();
                                int hashCode2 = nextName2.hashCode();
                                if (hashCode2 != -2105551094) {
                                    if (hashCode2 == 1583758243 && nextName2.equals("action_type")) {
                                        String nextString3 = jsonReader.nextString();
                                        int hashCode3 = nextString3.hashCode();
                                        if (hashCode3 != 64208429) {
                                            if (hashCode3 != 82862015) {
                                                if (hashCode3 == 1856333582 && nextString3.equals("UNKNOWN_ACTION_TYPE")) {
                                                    i4 = 1;
                                                    obj2.f14932b = i4;
                                                }
                                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(nextString3));
                                            }
                                            if (!nextString3.equals("WRITE")) {
                                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(nextString3));
                                            }
                                            i4 = 2;
                                            obj2.f14932b = i4;
                                        } else {
                                            if (!nextString3.equals("CLEAR")) {
                                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(nextString3));
                                            }
                                            i4 = 3;
                                            obj2.f14932b = i4;
                                        }
                                    }
                                    jsonReader.skipValue();
                                } else if (nextName2.equals("args_json")) {
                                    obj2.f14931a = jsonReader.nextString();
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            ((List) obj.f8640g).add(obj2);
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -986806987:
                    if (nextName.equals("request_info_keys")) {
                        obj.f8639f = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            ((List) obj.f8639f).add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipValue();
                    }
                case -790907624:
                    if (nextName.equals("consent_form_payload")) {
                        obj.f8636a = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                default:
                    jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return obj;
    }

    public void a(n3.i iVar) {
        if (((HashSet) this.d).contains(iVar.f14132a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f8638e).add(iVar);
    }

    public C1814a b() {
        if (((InterfaceC1817d) this.f8639f) != null) {
            return new C1814a(this.f8636a, new HashSet((HashSet) this.d), new HashSet((HashSet) this.f8638e), this.f8637b, this.c, (InterfaceC1817d) this.f8639f, (HashSet) this.f8640g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public Object d() {
        String str = this.f8636a;
        String str2 = (String) this.d;
        String str3 = (String) this.f8638e;
        int i4 = this.f8637b;
        WebView webView = (WebView) this.f8640g;
        String str4 = (String) this.f8639f;
        int i5 = this.c;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        Gh gh = new Gh(str, str2);
        Vq q4 = C0347Uc.q("javascript");
        Vq q5 = C0347Uc.q(str3);
        Sq o4 = C0347Uc.o(U.a.a(i4));
        Vq vq = Vq.f7298r;
        if (q4 == vq) {
            Y9.s("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (o4 == null) {
            Y9.s("Omid js session error; Unable to parse creative type: ".concat(U.a.w(i4)));
            return null;
        }
        if (o4 == Sq.f7014s && q5 == vq) {
            Y9.s("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str3)));
            return null;
        }
        l.J0 j02 = new l.J0(gh, webView, str4, Qq.f6703q);
        u0.g p3 = u0.g.p(o4, C0347Uc.p(U.a.b(i5)), q4, q5);
        if (Wj.f7528E.f7724p) {
            return new Rq(p3, j02);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }
}
