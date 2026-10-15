package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.eb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0563eb implements As {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8616b;

    public /* synthetic */ C0563eb(int i4, Object obj) {
        this.f8615a = i4;
        this.f8616b = obj;
    }

    @Override // com.google.android.gms.internal.ads.As
    public final Object apply(Object obj) {
        boolean z4;
        String str;
        int i4;
        int i5;
        String str2;
        float f4;
        int i6;
        DisplayMetrics displayMetrics;
        int i7 = this.f8615a;
        int i8 = 0;
        int i9 = -1;
        String str3 = null;
        Object obj2 = this.f8616b;
        switch (i7) {
            case 0:
                C0326Qb c0326Qb = (C0326Qb) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                C0937n6 c0937n6 = AbstractC1066q6.f10197a;
                O1.r rVar = O1.r.d;
                C1016p c1016p = rVar.f1380b;
                int i10 = 0;
                SharedPreferences.Editor edit = ((Context) c0326Qb.f6660p).getSharedPreferences("google_ads_flags", 0).edit();
                ArrayList arrayList = (ArrayList) rVar.f1379a.f6525p;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    C0937n6 c0937n62 = (C0937n6) obj3;
                    if (c0937n62.f9714a == 1) {
                        Object a4 = c0937n62.a(jSONObject);
                        switch (c0937n62.d) {
                            case 0:
                                edit.putBoolean(c0937n62.f9715b, ((Boolean) a4).booleanValue());
                                break;
                            case 1:
                                edit.putInt(c0937n62.f9715b, ((Integer) a4).intValue());
                                break;
                            case 2:
                                edit.putLong(c0937n62.f9715b, ((Long) a4).longValue());
                                break;
                            case 3:
                                edit.putFloat(c0937n62.f9715b, ((Float) a4).floatValue());
                                break;
                            default:
                                edit.putString(c0937n62.f9715b, (String) a4);
                                break;
                        }
                    }
                }
                if (jSONObject != null) {
                    edit.putString("flag_configuration", jSONObject.toString());
                } else {
                    Y9.p("Flag Json is null.");
                }
                C1016p c1016p2 = O1.r.d.f1380b;
                edit.commit();
                SharedPreferences.Editor edit2 = ((SharedPreferences) c0326Qb.f6661q).edit();
                N1.n.f1204A.f1212j.getClass();
                edit2.putLong("js_last_update", System.currentTimeMillis()).apply();
                return null;
            case 1:
                Aj aj = (Aj) obj2;
                InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) obj;
                interfaceC0308Md.A0("/result", aj.f3979i);
                C0396ae H3 = interfaceC0308Md.H();
                N1.a aVar = new N1.a(aj.c, null);
                Xl xl = aj.f3980j;
                Oq oq = aj.f3981k;
                C0658gk c0658gk = aj.d;
                InterfaceC1263uq interfaceC1263uq = aj.f3975e;
                C1299vj c1299vj = aj.f3973a;
                H3.l(null, c1299vj, c1299vj, c1299vj, c1299vj, false, null, aVar, null, null, xl, oq, c0658gk, interfaceC1263uq, null, null, null, null, null);
                return interfaceC0308Md;
            case 2:
                El el = (El) obj2;
                Xj.k(el.c, (JSONObject) obj);
                return el;
            case 3:
                return ((C0256Ce) obj2).f0();
            case 4:
                Un un = (Un) obj2;
                Jp jp = (Jp) un.c;
                O1.X0 x02 = jp.f5910e;
                O1.X0[] x0Arr = x02.f1328u;
                if (x0Arr == null) {
                    String str4 = x02.f1322o;
                    z4 = x02.f1330w;
                    str = str4;
                } else {
                    z4 = false;
                    boolean z5 = false;
                    boolean z6 = false;
                    str = null;
                    for (O1.X0 x03 : x0Arr) {
                        boolean z7 = x03.f1330w;
                        if (!z7 && !z5) {
                            str = x03.f1322o;
                            z5 = true;
                        }
                        if (z7) {
                            if (!z6) {
                                z4 = true;
                            }
                            z6 = true;
                        }
                        if (!z5 || !z6) {
                        }
                    }
                }
                Resources resources = ((Context) un.d).getResources();
                if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
                    i4 = 0;
                    i5 = 0;
                    str2 = null;
                    f4 = 0.0f;
                } else {
                    C1035pc c1035pc = (C1035pc) un.f7185e;
                    float f5 = displayMetrics.density;
                    int i11 = displayMetrics.widthPixels;
                    int i12 = displayMetrics.heightPixels;
                    str2 = c1035pc.c().A();
                    i5 = i12;
                    i4 = i11;
                    f4 = f5;
                }
                StringBuilder sb = new StringBuilder();
                O1.X0[] x0Arr2 = x02.f1328u;
                if (x0Arr2 != null) {
                    boolean z8 = false;
                    for (O1.X0 x04 : x0Arr2) {
                        if (x04.f1330w) {
                            z8 = true;
                        } else {
                            if (sb.length() != 0) {
                                sb.append("|");
                            }
                            int i13 = x04.f1326s;
                            if (i13 == -1) {
                                i13 = f4 != 0.0f ? (int) (x04.f1327t / f4) : -1;
                            }
                            sb.append(i13);
                            sb.append("x");
                            int i14 = x04.f1323p;
                            if (i14 == -2) {
                                i14 = f4 != 0.0f ? (int) (x04.f1324q / f4) : -2;
                            }
                            sb.append(i14);
                        }
                    }
                    if (z8) {
                        if (sb.length() != 0) {
                            i6 = 0;
                            sb.insert(0, "|");
                        } else {
                            i6 = 0;
                        }
                        sb.insert(i6, "320x50");
                    }
                }
                return new Vn(x02, str, z4, sb.toString(), f4, i4, i5, str2, jp.f5921p);
            case 5:
                ((C1035pc) ((Nn) obj2).d).h("AppSetIdInfoSignal", (Exception) obj);
                return new C0406ao(i9, i8, str3);
            case 6:
                ((C1035pc) ((Ao) obj2).c).h("AppSetIdInfoGmscoreSignal", (Exception) obj);
                return new C0406ao(i9, 2, str3);
            case 7:
                ((C1035pc) ((Ao) obj2).c).h("AttestationTokenSignal", (Exception) obj);
                return null;
            case 8:
                ((C1035pc) ((No) obj2).f6392e).h("TrustlessTokenSignal", (Exception) obj);
                return null;
            default:
                Yp yp = (Yp) obj2;
                yp.c = (Yf) obj;
                return yp;
        }
    }
}
