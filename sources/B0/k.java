package B0;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.ads.I3;
import com.google.android.gms.internal.ads.J3;
import com.google.android.gms.internal.ads.Y9;
import com.google.android.gms.internal.measurement.C1510e1;
import com.google.android.gms.internal.play_billing.AbstractC1609e;
import com.google.android.gms.internal.play_billing.AbstractC1629o;
import com.google.android.gms.internal.play_billing.C1605c;
import com.google.android.gms.internal.play_billing.C1615h;
import com.google.android.gms.internal.play_billing.T0;
import com.google.android.gms.internal.play_billing.V0;
import com.google.android.gms.internal.play_billing.W0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import n2.BinderC1813b;
import n2.InterfaceC1812a;
import org.json.JSONException;
import org.json.JSONObject;
import t2.I;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class k implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f85b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k(b bVar, String str, Object obj, int i4) {
        this.f84a = i4;
        this.c = str;
        this.d = obj;
        this.f85b = bVar;
    }

    public /* synthetic */ k(W1.b bVar, Object obj, InterfaceC1812a interfaceC1812a, int i4) {
        this.f84a = i4;
        this.c = bVar;
        this.d = obj;
        this.f85b = interfaceC1812a;
    }

    public /* synthetic */ k(I i4, String str, JSONObject jSONObject) {
        this.f84a = 4;
        this.d = i4;
        this.c = str;
        this.f85b = jSONObject;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1510e1 c1510e1;
        Bundle bundle;
        r rVar;
        int i4 = 3;
        switch (this.f84a) {
            case 0:
                b bVar = (b) this.f85b;
                String str = (String) this.c;
                AbstractC1629o.d("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
                ArrayList arrayList = new ArrayList();
                boolean z4 = bVar.f55l;
                bVar.f63t.getClass();
                bVar.f63t.getClass();
                String str2 = bVar.f47b;
                Bundle bundle2 = new Bundle();
                bundle2.putString("playBillingLibraryVersion", str2);
                int i5 = 1;
                if (z4) {
                    bundle2.putBoolean("enablePendingPurchases", true);
                }
                String str3 = null;
                while (true) {
                    try {
                        if (bVar.f55l) {
                            V0 v02 = bVar.f50g;
                            int i6 = i5 != bVar.f61r ? 9 : 19;
                            String packageName = bVar.f48e.getPackageName();
                            T0 t02 = (T0) v02;
                            Parcel Q3 = t02.Q();
                            Q3.writeInt(i6);
                            Q3.writeString(packageName);
                            Q3.writeString(str);
                            Q3.writeString(str3);
                            int i7 = W0.f12172a;
                            Q3.writeInt(i5);
                            bundle2.writeToParcel(Q3, 0);
                            Parcel a02 = t02.a0(Q3, 11);
                            Parcelable.Creator creator = Bundle.CREATOR;
                            bundle = (Bundle) W0.a(a02);
                            a02.recycle();
                        } else {
                            V0 v03 = bVar.f50g;
                            String packageName2 = bVar.f48e.getPackageName();
                            T0 t03 = (T0) v03;
                            Parcel Q4 = t03.Q();
                            Q4.writeInt(i4);
                            Q4.writeString(packageName2);
                            Q4.writeString(str);
                            Q4.writeString(str3);
                            Parcel a03 = t03.a0(Q4, 4);
                            Parcelable.Creator creator2 = Bundle.CREATOR;
                            bundle = (Bundle) W0.a(a03);
                            a03.recycle();
                        }
                        d dVar = p.f100i;
                        if (bundle == null) {
                            AbstractC1629o.e("BillingClient", "getPurchase() got null owned items list");
                            rVar = new r(54, dVar);
                        } else {
                            int a4 = AbstractC1629o.a(bundle, "BillingClient");
                            String c = AbstractC1629o.c(bundle, "BillingClient");
                            d b4 = d.b();
                            b4.f72b = a4;
                            b4.c = c;
                            d a5 = b4.a();
                            if (a4 != 0) {
                                AbstractC1629o.e("BillingClient", "getPurchase() failed. Response code: " + a4);
                                rVar = new r(23, a5);
                            } else if (bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundle.containsKey("INAPP_PURCHASE_DATA_LIST") && bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                                if (stringArrayList == null) {
                                    AbstractC1629o.e("BillingClient", "Bundle returned from getPurchase() contains null SKUs list.");
                                    rVar = new r(56, dVar);
                                } else if (stringArrayList2 == null) {
                                    AbstractC1629o.e("BillingClient", "Bundle returned from getPurchase() contains null purchases list.");
                                    rVar = new r(57, dVar);
                                } else if (stringArrayList3 == null) {
                                    AbstractC1629o.e("BillingClient", "Bundle returned from getPurchase() contains null signatures list.");
                                    rVar = new r(58, dVar);
                                } else {
                                    rVar = new r(i5, p.f101j);
                                }
                            } else {
                                AbstractC1629o.e("BillingClient", "Bundle returned from getPurchase() doesn't contain required fields.");
                                rVar = new r(55, dVar);
                            }
                        }
                        d dVar2 = (d) rVar.f113p;
                        if (dVar2 != p.f101j) {
                            bVar.h(n.a(rVar.f112o, 9, dVar2));
                            c1510e1 = new C1510e1(i5, dVar2, null);
                        } else {
                            ArrayList<String> stringArrayList4 = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                            ArrayList<String> stringArrayList5 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            ArrayList<String> stringArrayList6 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                            boolean z5 = false;
                            for (int i8 = 0; i8 < stringArrayList5.size(); i8++) {
                                String str4 = stringArrayList5.get(i8);
                                String str5 = stringArrayList6.get(i8);
                                AbstractC1629o.d("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList4.get(i8))));
                                try {
                                    Purchase purchase = new Purchase(str4, str5);
                                    JSONObject jSONObject = purchase.c;
                                    if (TextUtils.isEmpty(jSONObject.optString("token", jSONObject.optString("purchaseToken")))) {
                                        AbstractC1629o.e("BillingClient", "BUG: empty/null token!");
                                        z5 = true;
                                    }
                                    arrayList.add(purchase);
                                } catch (JSONException e4) {
                                    AbstractC1629o.f("BillingClient", "Got an exception trying to decode the purchase!", e4);
                                    d dVar3 = p.f100i;
                                    bVar.h(n.a(51, 9, dVar3));
                                    c1510e1 = new C1510e1(1, dVar3, null);
                                }
                            }
                            if (z5) {
                                bVar.h(n.a(26, 9, p.f100i));
                            }
                            str3 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            AbstractC1629o.d("BillingClient", "Continuation token: ".concat(String.valueOf(str3)));
                            if (TextUtils.isEmpty(str3)) {
                                c1510e1 = new C1510e1(1, p.f101j, arrayList);
                            } else {
                                i4 = 3;
                                i5 = 1;
                            }
                        }
                    } catch (Exception e5) {
                        d dVar4 = p.f102k;
                        bVar.h(n.a(52, 9, dVar4));
                        AbstractC1629o.f("BillingClient", "Got exception trying to get purchasesm try to reconnect", e5);
                        c1510e1 = new C1510e1(1, dVar4, null);
                    }
                }
                List list = (List) c1510e1.f11914p;
                if (list != null) {
                    ((e) this.d).a((d) c1510e1.f11915q, list);
                    return null;
                }
                e eVar = (e) this.d;
                d dVar5 = (d) c1510e1.f11915q;
                C1605c c1605c = AbstractC1609e.f12200p;
                eVar.a(dVar5, C1615h.f12205s);
                return null;
            case 1:
                b bVar2 = (b) this.f85b;
                String str6 = (String) this.c;
                String str7 = (String) this.d;
                V0 v04 = bVar2.f50g;
                String packageName3 = bVar2.f48e.getPackageName();
                T0 t04 = (T0) v04;
                Parcel Q5 = t04.Q();
                Q5.writeInt(3);
                Q5.writeString(packageName3);
                Q5.writeString(str6);
                Q5.writeString(str7);
                Q5.writeString(null);
                Parcel a04 = t04.a0(Q5, 3);
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) W0.a(a04);
                a04.recycle();
                return bundle3;
            case 2:
                W1.b bVar3 = (W1.b) this.c;
                Uri uri = (Uri) this.d;
                InterfaceC1812a interfaceC1812a = (InterfaceC1812a) this.f85b;
                bVar3.getClass();
                try {
                    uri = bVar3.f1974r.a(uri, bVar3.f1973q, (View) BinderC1813b.C2(interfaceC1812a), null);
                } catch (J3 e6) {
                    Y9.t("", e6);
                }
                if (uri.getQueryParameter("ms") != null) {
                    return uri;
                }
                throw new Exception("Failed to append spam signals to click url.");
            case 3:
                W1.b bVar4 = (W1.b) this.c;
                List<Uri> list2 = (List) this.d;
                InterfaceC1812a interfaceC1812a2 = (InterfaceC1812a) this.f85b;
                I3 i32 = bVar4.f1974r;
                i32.getClass();
                String d = i32.f5531b.d(bVar4.f1973q, (View) BinderC1813b.C2(interfaceC1812a2), null);
                if (TextUtils.isEmpty(d)) {
                    throw new Exception("Failed to get view signals.");
                }
                ArrayList arrayList2 = new ArrayList();
                for (Uri uri2 : list2) {
                    if (W1.b.R3(uri2, bVar4.f1967P, bVar4.f1968Q)) {
                        arrayList2.add(W1.b.S3(uri2, "ms", d));
                    } else {
                        Y9.s("Not a Google URL: ".concat(String.valueOf(uri2)));
                        arrayList2.add(uri2);
                    }
                }
                if (arrayList2.isEmpty()) {
                    throw new Exception("Empty impression URLs result.");
                }
                return arrayList2;
            default:
                return Boolean.valueOf(((I) this.d).a((String) this.c, (JSONObject) this.f85b));
        }
    }
}
