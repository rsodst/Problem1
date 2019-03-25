package Entry;
import java.awt.EventQueue;

import javax.swing.JFrame;

import Services.AreaValueService;
import Shared.AreaDetails;
import Shared.RegionDetails;
import Shared.ValueDescription;

import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

import Dictionaries.BonusMalusDictionary;
import Dictionaries.EnginePowerDictionary;
import Dictionaries.InsurancePeriodDictionary;
import Dictionaries.PeriodOfUseDictionary;
import Dictionaries.PersonsAllowedToDriveDictionary;
import Dictionaries.VehicleOwnerTypeDictionary;
import Dictionaries.VehicleRegistrationCountryDictionary;
import Dictionaries.VehicleTypeDictionary;
import Enums.BonusMalusEnum;
import Enums.EnginePowerEnum;
import Enums.InsurancePeriodEnum;
import Enums.PeriodOfUseEnum;
import Enums.PersonsAllowedToDriveEnum;
import Enums.VehicleOwnerTypeEnum;
import Enums.VehicleRegistrationCountryEnum;
import Enums.VehicleTypeEnum;
import Models.DriverDescription;
import Models.OwnerDescription;
import Models.VehicleDescription;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.event.PopupMenuEvent;
import javax.swing.JTextPane;

public class MainForm {

	VehicleRegistrationCountryDictionary vehicleRegistrationCountryDictionary = new VehicleRegistrationCountryDictionary();
	VehicleTypeDictionary vehicleTypeDictionary = new VehicleTypeDictionary();
	EnginePowerDictionary enginePowerDictionary = new EnginePowerDictionary();
	VehicleOwnerTypeDictionary vehicleOwnerTypeDictionary = new VehicleOwnerTypeDictionary();
	PeriodOfUseDictionary periodOfUseDictionary = new PeriodOfUseDictionary();
	InsurancePeriodDictionary insurancePeriodDictionary = new InsurancePeriodDictionary();
	BonusMalusDictionary bonusMalusDictionary = new BonusMalusDictionary();
	PersonsAllowedToDriveDictionary personsAllowedToDriveDictionary = new PersonsAllowedToDriveDictionary();

	OsagoCalculatorService osagoCalculatorService = new OsagoCalculatorService();

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm window = new MainForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 455, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		InitAreaCombobox(frame);
	}

	JComboBox RegionSelector = new JComboBox();
	JComboBox AreaSelector = new JComboBox();

	private void InitAreaCombobox(JFrame frame) {

		AreaValueService areaValues = new AreaValueService();

		for (AreaDetails area : areaValues.areas) {
			AreaSelector.addItem(new ValueDescription<Integer>(area.Id, area.Name));
		}

		for (RegionDetails region : areaValues.Get(1).Regions) {
			RegionSelector.addItem(new ValueDescription<Integer>(region.Id, region.Name));
		}

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 422, 412);
		frame.getContentPane().add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Транспортное средство", null, panel, null);
		panel.setLayout(null);

		JComboBox VehicleRegistrationCountry = new JComboBox();

		for (ValueDescription<VehicleRegistrationCountryEnum> description : vehicleRegistrationCountryDictionary
				.GetDescriptions()) {
			VehicleRegistrationCountry.addItem(description);
		}

		VehicleRegistrationCountry.setBounds(10, 39, 202, 20);
		panel.add(VehicleRegistrationCountry);

		JLabel label = new JLabel(vehicleRegistrationCountryDictionary.Description);
		label.setBounds(10, 14, 202, 14);
		panel.add(label);

		JLabel label_1 = new JLabel(vehicleTypeDictionary.Description);
		label_1.setBounds(10, 79, 202, 14);
		panel.add(label_1);

		JComboBox VehicleType = new JComboBox();

		for (ValueDescription<VehicleTypeEnum> description : vehicleTypeDictionary.GetDescriptions()) {
			VehicleType.addItem(description);
		}

		VehicleType.setBounds(10, 104, 202, 20);
		panel.add(VehicleType);

		JLabel label_2 = new JLabel(enginePowerDictionary.Description);
		label_2.setBounds(10, 144, 202, 14);
		panel.add(label_2);

		JComboBox EnginePower = new JComboBox();

		for (ValueDescription<EnginePowerEnum> description : enginePowerDictionary.GetDescriptions()) {
			EnginePower.addItem(description);
		}

		EnginePower.setBounds(10, 169, 202, 20);
		panel.add(EnginePower);

		JButton Next = new JButton("\u0414\u0430\u043B\u0435\u0435");
		Next.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		Next.setBounds(318, 313, 89, 23);
		panel.add(Next);

		JComboBox BonusMalusRate = new JComboBox();

		for (ValueDescription<BonusMalusEnum> description : bonusMalusDictionary.GetDescriptions()) {
			BonusMalusRate.addItem(description);
		}

		BonusMalusRate.setBounds(10, 234, 202, 20);
		panel.add(BonusMalusRate);

		JLabel label_6 = new JLabel(bonusMalusDictionary.Description);
		label_6.setBounds(10, 209, 202, 14);
		panel.add(label_6);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Владелец Транспортного средства", null, panel_1, null);
		panel_1.setLayout(null);

		JLabel regionLabel = new JLabel("\u0420\u0435\u0433\u0438\u043E\u043D");
		regionLabel.setBounds(10, 8, 199, 14);
		panel_1.add(regionLabel);
		AreaSelector.setBounds(10, 32, 199, 20);
		panel_1.add(AreaSelector);

		RegionSelector.addPopupMenuListener(new PopupMenuListener() {
			public void popupMenuCanceled(PopupMenuEvent arg0) {
			}

			public void popupMenuWillBecomeInvisible(PopupMenuEvent arg0) {
			}

			public void popupMenuWillBecomeVisible(PopupMenuEvent arg0) {
				ValueDescription<Integer> item = (ValueDescription<Integer>) AreaSelector.getSelectedItem();

				RegionSelector.removeAllItems();

				for (AreaDetails area : areaValues.areas) {
					if (area.Id == item.Key) {
						for (RegionDetails region : area.Regions) {
							RegionSelector.addItem(new ValueDescription(region.Id, region.Name));
						}
					}
				}
			}
		});

		RegionSelector.setBounds(10, 88, 199, 20);
		panel_1.add(RegionSelector);

		JLabel areaLabel = new JLabel(
				"\u041D\u0430\u0441\u0435\u043B\u0435\u043D\u043D\u044B\u0439 \u043F\u0443\u043D\u043A\u0442");
		areaLabel.setBounds(10, 63, 199, 14);
		panel_1.add(areaLabel);

		JComboBox OwnerType = new JComboBox();

		for (ValueDescription<VehicleOwnerTypeEnum> description : vehicleOwnerTypeDictionary.GetDescriptions()) {
			OwnerType.addItem(description);
		}

		OwnerType.setBounds(10, 146, 199, 20);
		panel_1.add(OwnerType);

		JLabel label_3 = new JLabel(vehicleOwnerTypeDictionary.Description);
		label_3.setBounds(10, 121, 199, 14);
		panel_1.add(label_3);

		JComboBox UsefulPeriod = new JComboBox();

		for (ValueDescription<PeriodOfUseEnum> description : periodOfUseDictionary.GetDescriptions()) {
			UsefulPeriod.addItem(description);
		}

		UsefulPeriod.setBounds(10, 202, 199, 20);
		panel_1.add(UsefulPeriod);

		JLabel label_4 = new JLabel(periodOfUseDictionary.Description);
		label_4.setBounds(10, 177, 199, 14);
		panel_1.add(label_4);

		JComboBox InsurancePeriod = new JComboBox();

		for (ValueDescription<InsurancePeriodEnum> description : insurancePeriodDictionary.GetDescriptions()) {
			InsurancePeriod.addItem(description);
		}

		InsurancePeriod.setBounds(10, 258, 199, 20);
		panel_1.add(InsurancePeriod);

		JLabel label_5 = new JLabel(insurancePeriodDictionary.Description);
		label_5.setBounds(10, 233, 199, 14);
		panel_1.add(label_5);

		JTextPane Age = new JTextPane();
		JTextPane Expirience = new JTextPane();
		JComboBox OwnerList = new JComboBox();

		JButton GetResult = new JButton("\u0414\u0430\u043B\u0435\u0435");
		GetResult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				VehicleDescription vehicle = new VehicleDescription();
				OwnerDescription owner = new OwnerDescription();

				vehicle.EnginePower = ((ValueDescription<EnginePowerEnum>) EnginePower.getSelectedItem()).Key;
				vehicle.VehicleRegistrationCountry = ((ValueDescription<VehicleRegistrationCountryEnum>) VehicleRegistrationCountry
						.getSelectedItem()).Key;
				vehicle.VehicleType = ((ValueDescription<VehicleTypeEnum>) VehicleType.getSelectedItem()).Key;

				owner.AreaId = ((ValueDescription<Integer>) AreaSelector.getSelectedItem()).Key;
				owner.RegionId = ((ValueDescription<Integer>) RegionSelector.getSelectedItem()).Key;
				;
				owner.BonusMalusRate = ((ValueDescription<BonusMalusEnum>) BonusMalusRate.getSelectedItem()).Key;
				
				owner.DriverDescription = new DriverDescription(Integer.parseInt(Age.getText()),
						Integer.parseInt(Expirience.getText()));
				
				
				//owner.DriverDescription = new DriverDescription(10,10);
				
				owner.InsurancePeriod = ((ValueDescription<InsurancePeriodEnum>) InsurancePeriod.getSelectedItem()).Key;
				owner.PersonsAllowedToDrive = ((ValueDescription<PersonsAllowedToDriveEnum>) OwnerList
						.getSelectedItem()).Key;
				owner.VehicleOwnerType =((ValueDescription<VehicleOwnerTypeEnum>) OwnerType
						.getSelectedItem()).Key;

				try {
					float result = osagoCalculatorService.Calc(vehicle, owner);
					JOptionPane.showMessageDialog(frame, result);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(frame, "Failed");
					e.printStackTrace();
				}
				
				
			}
		});

		GetResult.setBounds(318, 350, 89, 23);
		panel_1.add(GetResult);

		Age.setBounds(271, 32, 75, 20);
		panel_1.add(Age);

		Expirience.setBounds(271, 88, 75, 20);
		panel_1.add(Expirience);

		JLabel label_7 = new JLabel("\u041E\u043F\u044B\u0442");
		label_7.setBounds(271, 63, 136, 14);
		panel_1.add(label_7);

		JLabel label_8 = new JLabel("\u0412\u043E\u0437\u0440\u0430\u0441\u0442");
		label_8.setBounds(271, 8, 136, 14);
		panel_1.add(label_8);

		JLabel label_9 = new JLabel(personsAllowedToDriveDictionary.Description);
		label_9.setBounds(10, 289, 199, 14);
		panel_1.add(label_9);

		for (ValueDescription<PersonsAllowedToDriveEnum> description : personsAllowedToDriveDictionary
				.GetDescriptions()) {
			OwnerList.addItem(description);
		}

		OwnerList.setBounds(10, 314, 199, 20);
		panel_1.add(OwnerList);

		AreaSelector.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				ValueDescription<Integer> item = (ValueDescription<Integer>) arg0.getItem();

				RegionSelector.removeAllItems();

				for (AreaDetails area : areaValues.areas) {
					if (area.Id == item.Key) {
						for (RegionDetails region : area.Regions) {
							RegionSelector.addItem(new ValueDescription(region.Id, region.Name));
						}
					}
				}
			}
		});
	}
}
